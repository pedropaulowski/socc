import React from "react";
import styles from "./Interface.module.css";
import type { KnowledgeArea } from "../types/types";

interface HeaderProps {
  selectedArea: KnowledgeArea | null;
}

export const Header: React.FC<HeaderProps> = ({ selectedArea }) => {
  if (!selectedArea) return null;

  return (
    <div className={styles.header}>
      <h2 className={styles.headerTitle}>{selectedArea.nome}</h2>
      <p className={styles.headerDescription}>{selectedArea.descricao}</p>
    </div>
  );
};
