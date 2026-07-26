# 🐓 Bartô Galeno

## O galo que transforma escolhas em reflexões!

Quiz interativo gamificado desenvolvido em **Kotlin** para dispositivos **Android**.

O projeto apresenta situações inspiradas no ambiente de trabalho, incentivando o utilizador a refletir sobre comportamentos em grupo de forma leve, divertida e educativa, através do personagem **Bartô Galeno**.

O nome do personagem faz uma homenagem ao tradicional **Galo de Barcelos**, um dos maiores símbolos de Portugal, e ao cantor e compositor brasileiro **Bartô Galeno**, conhecido por sua carreira na música romântica e brega.

> **Importante:** O aplicativo **não realiza testes psicológicos nem avaliações de personalidade**. As mensagens apresentadas possuem apenas caráter educativo e reflexivo.

---

# 🎓 Contexto Acadêmico

**Curso:** Técnico Especialista em Tecnologias e Programação de Sistemas de Informação (TPSI)

**Turma:** CET-481RA015 TPSI.D.P.32

**Nível:** QNQ N5

**UFCD 00609** – Desenvolver Aplicações Móveis (Plataforma Android)

**Formador:** Cristiano Rocha Ferreira

**Formando:** Fernando Cesar Ferreira Farias

---

# 🎯 Objetivo

Estimular a reflexão sobre atitudes relacionadas ao trabalho em grupo, abordando competências como:

- Comunicação
- Respeito
- Responsabilidade
- Participação
- Ética
- Inteligência Relacional

Ao final do questionário, o Bartô apresenta uma reflexão positiva baseada nas escolhas realizadas pelo utilizador.

---

# 📱 Fluxo da Aplicação

```
StartActivity
        │
        ▼
QuestionActivity
        │
        ▼
TransitionActivity
        │
        ▼
ResultActivity
```

---

# ⚙️ Funcionalidades

- Cadastro do nome do utilizador
- Introdução com áudio
- Efeito máquina de escrever
- Personagem animado (Bartô Galeno)
- Quiz com situações do ambiente de trabalho
- Cálculo do comportamento predominante
- Reflexão personalizada
- Possibilidade de refazer o questionário
- Encerramento da aplicação

---

# 🏗 Arquitetura

```
com.fcesar.bartogaleno

├── animation
│   └── BartoAnimator
│
├── audio
│
├── data
│   ├── MessageRepository
│   └── QuestionRepository
│
├── model
│   ├── Behavior
│   └── Question
│
├── ui
│   ├── StartActivity
│   ├── QuestionActivity
│   ├── TransitionActivity
│   └── ResultActivity
│
└── util
    ├── QuestionEvaluator
    └── TypeWriter
```

---

# 🛠 Tecnologias Utilizadas

- Kotlin
- Android Studio
- Android SDK
- ConstraintLayout
- MediaPlayer
- View Animation
- Material Design

---

# 📂 Recursos

### Áudio

- `intro_barto.ogg`

### Imagens

- `cenario_01`
- `galo_espera`
- `bg_overlay`
- `card_glass`

---

# 💡 Destaques do Projeto

- Arquitetura organizada em camadas.
- Componentes reutilizáveis (`TypeWriter` e `BartoAnimator`).
- Separação de responsabilidades.
- Interface simples e intuitiva.
- Personagem original criado para o projeto.
- Experiência interativa com animação e áudio.

---

# 🚀 Melhorias Futuras

- Novas animações do Bartô.
- Movimento das asas durante a fala.
- Piscar dos olhos.
- Movimento da cabeça.
- Novos efeitos sonoros.
- Ampliação do banco de perguntas.
- Estatísticas de utilização.
- Sistema de temas.

---

# 👨‍💻 Autor

**Fernando Cesar Ferreira Farias**

Curso: Técnico Especialista em Tecnologias e Programação de Sistemas de Informação (TPSI)

CINEL – Centro de Formação Profissional da Indústria Eletrónica, Energia, Telecomunicações e Tecnologias da Informação

Porto – Portugal

2026

---

# 📄 Licença

Projeto desenvolvido exclusivamente para fins académicos.
