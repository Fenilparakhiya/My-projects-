# Photo Gallery (React + Material UI)

A responsive, modern **photo gallery** built with **React** and **Material UI**. Create, edit, and delete albums, upload and manage photos, and browse comfortably on mobile or desktop. Designed with clean architecture, accessible components, and smooth client-side interactions.

---

## ✨ Features

- **Albums**: create / edit / delete
- **Photos**: upload, preview, view, update metadata, delete
- **Modern UI**: Material UI components, icons, dialogs, toasts
- **State management**: React hooks + context (clean separation of UI and data)
- **Scalable structure**: components, pages, hooks, utils, services
- **Backend integration via `REACT_APP_API_BASE_URL`

---

## 🧱 Tech Stack

- **Frontend**: React (hooks), Material UI
- **Tooling**: Node.js, npm, Vite or CRA (dev server + build), ESLint/Prettier (optional)
- **Images**: native `<input type="file" />` with client-side validation

> _If you later add a backend (e.g., Spring Boot or Node/Express), set the API URL via an environment variable—see **Environment** below._

---

## 🚀 Quick Start

> Requires **Node.js 16+** and **npm** installed.

```bash
# 1) Go to project
cd Photo-Gallery

# 2) Install deps
npm install

# 3) Start dev server (http://localhost:3000 or as printed)
npm start
