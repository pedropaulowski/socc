import React from "react";
import { Book } from "lucide-react";
import styles from "./Interface.module.css";
import type { KnowledgeArea } from "../types/types";

interface KnowledgeAreaItemProps {
  area: KnowledgeArea;
  isSelected: boolean;
  onSelect: (area: KnowledgeArea) => void;
}

export const KnowledgeAreaItem: React.FC<KnowledgeAreaItemProps> = ({
  area,
  isSelected,
  onSelect,
}) => (
  <button
    onClick={() => onSelect(area)}
    className={`${styles.areaItem} ${
      isSelected ? styles.areaItemSelected : ""
    }`}
  >
    <div className={styles.areaItemContent}>
      <Book size={20} />
      <div className={styles.areaItemText}>
        <h3 className={styles.areaItemTitle}>{area.nome}</h3>
        <p className={styles.areaItemDescription}>{area.descricao}</p>
      </div>
    </div>
  </button>
);
