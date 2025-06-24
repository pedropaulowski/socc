import React, { useState, useEffect } from "react";
import {
  Book,
  User,
  Mail,
  Calendar,
  BookOpen,
  Users,
  GraduationCap,
} from "lucide-react";
import styles from "./Interface.module.css";
import type { Discipline, KnowledgeArea, Professor } from "../types/types";
import { api } from "../services/service";

export const LoadingSpinner: React.FC = () => (
  <div className={styles.loadingContainer}>
    <div className={styles.spinner}></div>
  </div>
);
