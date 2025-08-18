# Photo Gallery Frontend

A responsive **photo gallery web application** built with **React 18** and **Material UI (MUI)**. Provides an intuitive interface for managing albums and photos with authentication support. The frontend is designed to connect to the **Album Management Backend API** for data persistence, authentication, and photo management.

---

## ✨ Features

- **Albums**
  - Create, edit, delete albums
  - View album details
  - Upload photos to albums
- **Photos**
  - Edit and update photo metadata
- **Authentication**
  - User registration, login, and logout
- **Pages**
  - Albums listing (`/`)
  - Add album (`/album/add`)
  - View album (`/album/show`)
  - Edit album (`/album/edit`)
  - Upload photos (`/album/upload`)
  - Edit photo (`/photo/edit`)
  - Static About page (`/about`)
  - Authentication: Login (`/login`), Register (`/register`), Logout (`/logout`)
- **UI/UX**
  - Responsive Material UI components
  - Scroll-to-top, custom layouts, reusable cards
  - Clean theme customization
  - Organized project structure for scalability

---

## 🧱 Tech Stack

- **React 18**
- **Material UI (MUI v5)** and icons
- **React Router v6** for routing
- **Axios** for API communication
- **Formik + Yup** for forms and validation
- **Framer Motion** for animations
- **Redux Toolkit** for state management
- Utility libraries: Lodash, React Dropzone, Simplebar

---

## 🚀 Getting Started

### Prerequisites
- **Node.js v16+**
- **npm v8+**

### Install & Run

```bash
# Install dependencies
npm install

# Start the development server
npm start

Frontend will be available at:
👉 http://localhost:3000

Build for Production
npm run build

🔗 Backend API Integration
This frontend connects to the Album Management API from repo. run that and connect with REACT_APP_API_BASE_URL=http://localhost:8080/api
📁 Project Structure
src/
  assets/             # Images, fonts, and static assets
  client/             # API client configs (if extended)
  components/         # Reusable UI components
    @extended/        # Extended widgets
    cards/            # UI cards
    Logo/             # Logo component
    third-party/      # Loader, MainCard, ScrollTop, etc.
  layout/             # Layouts
    MainLayout/       # Main app layout (Drawer, Header)
    MinimalLayout/    # Minimal layout (Auth pages)
  menu-items/         # Menu definitions
  pages/              # Application pages
    albums/           # Album CRUD (add, edit, list, show, upload)
    authentication/   # Login, Register, Logout, forms
    staticPages/      # About page
  App.js              # Root app wrapper
  routes/             # Route definitions (MainRoutes, LoginRoutes)
  themes/             # Theme customization
  index.js            # Entry point

🗂️ Routing Overview
	•	/ → Albums list
	•	/album/add → Add album
	•	/album/show → Show album
	•	/album/edit → Edit album
	•	/album/upload → Upload photos
	•	/photo/edit → Edit photo
	•	/about → About page
	•	/login → Login
	•	/register → Register
	•	/logout → Logout

☑️ Highlights
	•	Modern React + MUI frontend with clean theme
	•	Fully responsive and user-friendly design
	•	Organized codebase with layouts, reusable components, and pages
	•	Connects seamlessly to a backend API for persistence and security
	•	Includes auth flow and album/photo management

👤 Author

Fenil Parakhiya
LinkedIn: linkedin.com/in/fenil-parakhiya
GitHub: github.com/Fenilparakhiya
