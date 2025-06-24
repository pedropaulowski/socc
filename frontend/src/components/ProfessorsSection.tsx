import React from 'react';
import { Users } from 'lucide-react';
import type { Professor } from '../types/types';
import { Section } from './Section';
import { ProfessorCard } from './ProfessorCard';

interface ProfessorsSectionProps {
  professors: Professor[];
  loading: boolean;
  error: string | null;
  onRetry: () => void;
}

export const ProfessorsSection: React.FC<ProfessorsSectionProps> = ({
  professors,
  loading,
  error,
  onRetry,
}) => (
  <Section
    title="Professores"
    count={professors.length}
    icon={Users}
    loading={loading}
    error={error}
    isEmpty={professors.length === 0 && !loading && !error}
    emptyMessage="Nenhum professor encontrado para este núcleo"
    onRetry={onRetry}
  >
    {professors.map((professor) => (
      <ProfessorCard key={professor.id} professor={professor} />
    ))}
  </Section>
);
