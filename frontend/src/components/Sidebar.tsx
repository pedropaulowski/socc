import React from "react";
import { GraduationCap } from "lucide-react";
import styles from "./Interface.module.css";
import type { KnowledgeArea } from "../types/types";
import { LoadingSpinner } from "./LoadingSpinner";
import { ErrorState } from "./ErrorState";
import { KnowledgeAreaItem } from "./KnowledgeAreaItem";

interface SidebarProps {
  knowledgeAreas: KnowledgeArea[];
  selectedArea: KnowledgeArea | null;
  loading: boolean;
  error: string | null;
  onAreaSelect: (area: KnowledgeArea) => void;
  onRetry: () => void;
}

export const Sidebar: React.FC<SidebarProps> = ({
  knowledgeAreas,
  selectedArea,
  loading,
  error,
  onAreaSelect,
  onRetry,
}) => (
  <div className={styles.sidebar}>
    <div className={styles.sidebarHeader}>
      <h1 className={styles.sidebarTitle}>
        <GraduationCap size={24} />
        Núcleos de Conhecimento
      </h1>
    </div>

    <div className={styles.sidebarContent}>
      {loading ? (
        <LoadingSpinner />
      ) : error ? (
        <ErrorState message={error} onRetry={onRetry} />
      ) : (
        <div className={styles.areaList}>
          {knowledgeAreas.map((area) => (
            <KnowledgeAreaItem
              key={area.id}
              area={area}
              isSelected={selectedArea?.id === area.id}
              onSelect={onAreaSelect}
            />
          ))}
        </div>
      )}
    </div>
  </div>
);
