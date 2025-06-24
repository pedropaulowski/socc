import React, { useState, useEffect } from "react";
import styles from "./Interface.module.css";
import type { Discipline, KnowledgeArea, Professor } from "../types/types";
import { api } from "../services/service";
import { Sidebar } from "./Sidebar";
import { MainContent } from "./MainContent";

export default function Interface() {
  const [knowledgeAreas, setKnowledgeAreas] = useState<KnowledgeArea[]>([]);
  const [selectedArea, setSelectedArea] = useState<KnowledgeArea | null>(null);
  const [professors, setProfessors] = useState<Professor[]>([]);
  const [disciplines, setDisciplines] = useState<Discipline[]>([]);

  const [loading, setLoading] = useState({
    areas: true,
    professors: false,
    disciplines: false,
  });

  const [errors, setErrors] = useState({
    areas: null as string | null,
    professors: null as string | null,
    disciplines: null as string | null,
  });

  useEffect(() => {
    loadKnowledgeAreas();
  }, []);

  const loadKnowledgeAreas = async () => {
    try {
      setLoading((prev) => ({ ...prev, areas: true }));
      setErrors((prev) => ({ ...prev, areas: null }));
      const areas = await api.getKnowledgeAreas();
      setKnowledgeAreas(areas);
    } catch (error) {
      console.error("Error loading knowledge areas:", error);
      setErrors((prev) => ({
        ...prev,
        areas:
          "Erro ao carregar núcleos de conhecimento. Verifique se a API está funcionando.",
      }));
    } finally {
      setLoading((prev) => ({ ...prev, areas: false }));
    }
  };

  const loadProfessors = async (areaId: number) => {
    try {
      setLoading((prev) => ({ ...prev, professors: true }));
      setErrors((prev) => ({ ...prev, professors: null }));
      const professorsData = await api.getProfessorsByArea(areaId);
      setProfessors(professorsData);
    } catch (error) {
      console.error("Error loading professors:", error);
      setErrors((prev) => ({
        ...prev,
        professors:
          "Erro ao carregar professores. Verifique se a API está funcionando.",
      }));
      setProfessors([]);
    } finally {
      setLoading((prev) => ({ ...prev, professors: false }));
    }
  };

  const loadDisciplines = async (areaId: number) => {
    try {
      setLoading((prev) => ({ ...prev, disciplines: true }));
      setErrors((prev) => ({ ...prev, disciplines: null }));
      const disciplinesData = await api.getDisciplinesByArea(areaId);
      setDisciplines(disciplinesData);
    } catch (error) {
      console.error("Error loading disciplines:", error);
      setErrors((prev) => ({
        ...prev,
        disciplines:
          "Erro ao carregar disciplinas. Verifique se a API está funcionando.",
      }));
      setDisciplines([]);
    } finally {
      setLoading((prev) => ({ ...prev, disciplines: false }));
    }
  };

  const handleAreaSelect = async (area: KnowledgeArea) => {
    setSelectedArea(area);
    setProfessors([]);
    setDisciplines([]);

    await Promise.all([loadProfessors(area.id), loadDisciplines(area.id)]);
  };

  const handleRetryProfessors = () => {
    if (selectedArea) {
      loadProfessors(selectedArea.id);
    }
  };

  const handleRetryDisciplines = () => {
    if (selectedArea) {
      loadDisciplines(selectedArea.id);
    }
  };

  return (
    <div className={styles.container}>
      <Sidebar
        knowledgeAreas={knowledgeAreas}
        selectedArea={selectedArea}
        loading={loading.areas}
        error={errors.areas}
        onAreaSelect={handleAreaSelect}
        onRetry={loadKnowledgeAreas}
      />
      <MainContent
        selectedArea={selectedArea}
        professors={professors}
        disciplines={disciplines}
        loading={{
          professors: loading.professors,
          disciplines: loading.disciplines,
        }}
        errors={{
          professors: errors.professors,
          disciplines: errors.disciplines,
        }}
        onRetryProfessors={handleRetryProfessors}
        onRetryDisciplines={handleRetryDisciplines}
      />
    </div>
  );
}
