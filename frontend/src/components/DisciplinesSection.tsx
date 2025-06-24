import React from "react";
import { BookOpen } from "lucide-react";
import type { Discipline } from "../types/types";
import { Section } from "./Section";
import { DisciplineCard } from "./DisciplineCard";

interface DisciplinesSectionProps {
  disciplines: Discipline[];
  loading: boolean;
  error: string | null;
  onRetry: () => void;
}

export const DisciplinesSection: React.FC<DisciplinesSectionProps> = ({
  disciplines,
  loading,
  error,
  onRetry,
}) => (
  <Section
    title="Disciplinas"
    count={disciplines.length}
    icon={BookOpen}
    loading={loading}
    error={error}
    isEmpty={disciplines.length === 0 && !loading && !error}
    emptyMessage="Nenhuma disciplina encontrada para este núcleo"
    onRetry={onRetry}
  >
    {disciplines.map((discipline) => (
      <DisciplineCard key={discipline.id} discipline={discipline} />
    ))}
  </Section>
);
