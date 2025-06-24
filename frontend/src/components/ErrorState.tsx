import React from "react";
import styles from "./Interface.module.css";

interface ErrorStateProps {
  message: string;
  onRetry?: () => void;
}

export const ErrorState: React.FC<ErrorStateProps> = ({ message, onRetry }) => (
  <div className={styles.errorState}>
    <div className={styles.errorIcon}>⚠️</div>
    <p className={styles.errorMessage}>{message}</p>
    {onRetry && (
      <button onClick={onRetry} className={styles.retryButton}>
        Tentar Novamente
      </button>
    )}
  </div>
);
