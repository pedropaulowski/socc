import type { KnowledgeArea, Professor, Discipline } from "../types/types";

const API_BASE_URL = "http://localhost:8080";

export const api = {
  getKnowledgeAreas: async (): Promise<KnowledgeArea[]> => {
    try {
      const response = await fetch(`${API_BASE_URL}/nucleo_conhecimento/`);
      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }
      return await response.json();
    } catch (error) {
      console.error("Error fetching knowledge areas:", error);
      throw error;
    }
  },

  getProfessorsByArea: async (areaId: number): Promise<Professor[]> => {
    try {
      const response = await fetch(
        `${API_BASE_URL}/docentes/nucleo_conhecimento/${areaId}`
      );
      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }
      return await response.json();
    } catch (error) {
      console.error("Error fetching professors:", error);
      throw error;
    }
  },

  getDisciplinesByArea: async (areaId: number): Promise<Discipline[]> => {
    try {
      const response = await fetch(
        `${API_BASE_URL}/disciplinas/nucleo_conhecimento/${areaId}`
      );
      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }
      return await response.json();
    } catch (error) {
      console.error("Error fetching disciplines:", error);
      throw error;
    }
  },
};
