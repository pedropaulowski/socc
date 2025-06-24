import React from "react";
import { User, Mail, Calendar } from "lucide-react";
import styles from "./Interface.module.css";
import type { Professor } from "../types/types";

const formatDate = (dateString: string): string => {
  return new Date(dateString).toLocaleDateString("pt-BR");
};

interface ProfessorCardProps {
  professor: Professor;
}

export const ProfessorCard: React.FC<ProfessorCardProps> = ({ professor }) => (
  <div className={styles.card}>
    <div className={styles.cardContent}>
      <div className={styles.cardIcon}>
        <div className={`${styles.iconCircle} ${styles.iconCircleBlue}`}>
          <User size={24} />
        </div>
      </div>
      <div className={styles.cardInfo}>
        <h3 className={styles.cardTitle}>{professor.nome}</h3>
        <div className={styles.cardDetails}>
          <div className={styles.cardDetail}>
            <Mail size={16} />
            <span>{professor.email}</span>
          </div>
          <div className={styles.cardDetail}>
            <User size={16} />
            <span>@{professor.usuario}</span>
          </div>
          <div className={styles.cardDetail}>
            <Calendar size={16} />
            <span>Ingresso: {formatDate(professor.ingresso)}</span>
          </div>
        </div>
      </div>
    </div>
  </div>
);
