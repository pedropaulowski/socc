import React from "react";
import styles from "./Interface.module.css";
import { LoadingSpinner } from "./LoadingSpinner";
import { ErrorState } from "./ErrorState";
import { EmptyState } from "./EmptyState";

interface SectionProps {
  title: string;
  count: number;
  icon: React.ElementType;
  loading: boolean;
  error: string | null;
  isEmpty: boolean;
  emptyMessage: string;
  onRetry?: () => void;
  children: React.ReactNode;
}

export const Section: React.FC<SectionProps> = ({
  title,
  count,
  icon: Icon,
  loading,
  error,
  isEmpty,
  emptyMessage,
  onRetry,
  children,
}) => (
  <section className={styles.section}>
    <div className={styles.sectionHeader}>
      <Icon size={24} />
      <h3 className={styles.sectionTitle}>
        {title} ({count})
      </h3>
    </div>

    {loading ? (
      <LoadingSpinner />
    ) : error ? (
      <ErrorState message={error} onRetry={onRetry} />
    ) : isEmpty ? (
      <EmptyState message={emptyMessage} icon={Icon} />
    ) : (
      <div className={styles.cardGrid}>{children}</div>
    )}
  </section>
);
