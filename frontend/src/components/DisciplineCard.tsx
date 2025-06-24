import React from "react";
import { BookOpen } from "lucide-react";
import styles from "./Interface.module.css";
import type { Discipline } from "../types/types";

interface DisciplineCardProps {
  discipline: Discipline;
}

export const DisciplineCard: React.FC<DisciplineCardProps> = ({
  discipline,
}) => (
  <div className={styles.card}>
    <div className={styles.cardContent}>
      <div className={styles.cardIcon}>
        <div className={`${styles.iconCircle} ${styles.iconCircleGreen}`}>
          <BookOpen size={24} />
        </div>
      </div>
      <div className={styles.cardInfo}>
        <h3 className={styles.cardTitle}>{discipline.nome}</h3>
        <div className={styles.disciplineGrid}>
          <div className={styles.disciplineItem}>
            <span className={styles.disciplineLabel}>
              Carga Horária Teórica:
            </span>
            <span className={styles.disciplineValue}>
              {discipline.ch_teorica}h
            </span>
          </div>
          <div className={styles.disciplineItem}>
            <span className={styles.disciplineLabel}>
              Carga Horária Prática:
            </span>
            <span className={styles.disciplineValue}>
              {discipline.ch_pratica}h
            </span>
          </div>
          <div className={styles.disciplineItem}>
            <span className={styles.disciplineLabel}>Carga Horária Total:</span>
            <span
              className={`${styles.disciplineValue} ${styles.disciplineValueHighlight}`}
            >
              {discipline.ch_total}h
            </span>
          </div>
          <div className={styles.disciplineItem}>
            <span className={styles.disciplineLabel}>Matriz Curricular:</span>
            <span className={styles.disciplineValue}>{discipline.matriz}</span>
          </div>
        </div>
      </div>
    </div>
  </div>
);
