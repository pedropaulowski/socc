export interface KnowledgeArea {
  id: number;
  nome: string;
  descricao: string;
}

export interface Professor {
  id: number;
  nome: string;
  usuario: string;
  email: string;
  ingresso: string;
}

export interface Discipline {
  id: number;
  nucleo_id: number;
  matriz: number;
  ch_teorica: number;
  ch_pratica: number;
  ch_total: number;
  nome: string;
}
