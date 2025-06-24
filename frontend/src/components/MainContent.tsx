import React from "react";
import { Book } from "lucide-react";
import styles from "./Interface.module.css";
import type { KnowledgeArea, Professor, Discipline } from "../types/types";
import { EmptyState } from "./EmptyState";
import { Header } from "./Header";
import { ProfessorsSection } from "./ProfessorsSection";
import { DisciplinesSection } from "./DisciplinesSection";

interface MainContentProps {
  selectedArea: KnowledgeArea | null;
  professors: Professor[];
  disciplines: Discipline[];
  loading: {
    professors: boolean;
    disciplines: boolean;
  };
  errors: {
    professors: string | null;
    disciplines: string | null;
  };
  onRetryProfessors: () => void;
  onRetryDisciplines: () => void;
}

export const MainContent: React.FC<MainContentProps> = ({
  selectedArea,
  professors,
  disciplines,
  loading,
  errors,
  onRetryProfessors,
  onRetryDisciplines,
}) => (
  <div className={styles.mainContent}>
    {!selectedArea ? (
      <EmptyState
        message="Selecione um núcleo de conhecimento para visualizar"
        icon={Book}
      />
    ) : (
      <div className={styles.contentContainer}>
        <Header selectedArea={selectedArea} />
        <ProfessorsSection
          professors={professors}
          loading={loading.professors}
          error={errors.professors}
          onRetry={onRetryProfessors}
        />
        <DisciplinesSection
          disciplines={disciplines}
          loading={loading.disciplines}
          error={errors.disciplines}
          onRetry={onRetryDisciplines}
        />
      </div>
    )}
  </div>
);
