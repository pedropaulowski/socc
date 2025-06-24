import React from "react";
import styles from "./Interface.module.css";

interface EmptyStateProps {
  message: string;
  icon: React.ElementType;
}

export const EmptyState: React.FC<EmptyStateProps> = ({
  message,
  icon: Icon,
}) => (
  <div className={styles.emptyState}>
    <Icon size={48} />
    <p>{message}</p>
  </div>
);
