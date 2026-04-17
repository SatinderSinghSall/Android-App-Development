# 📱 Contacts Manager App (MVVM + Room Database)

![Android](https://img.shields.io/badge/Platform-Android-green)
![Language](https://img.shields.io/badge/Language-Java-orange)
![Architecture](https://img.shields.io/badge/Architecture-MVVM-blue)
![Database](https://img.shields.io/badge/Database-Room-red)
![UI](https://img.shields.io/badge/UI-Material%20Design-purple)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

A **modern Contacts Manager Android application** built using **MVVM Architecture** and **Room Database** for local persistence.

This project demonstrates **best practices for Android app development**, including **data binding, repository pattern, lifecycle-aware components, and clean UI design**.

---

# ✨ Features

### 📇 Contact Management

- Add new contacts
- View contact list
- Delete contacts
- Modern modal contact details

### 🗂 Local Database

- Uses **Room Database**
- Persistent local storage
- DAO-based database operations

### 🧠 MVVM Architecture

- Clean separation of concerns
- Lifecycle-aware components
- ViewModel + LiveData

### 🎨 Modern UI

- Material Design components
- SaaS-style UI
- Floating action button
- Contact avatars
- Modal dialogs

### ⚡ Reactive Data Updates

- Uses **LiveData observers**
- UI updates automatically when data changes

---

# 📸 App Screenshots

### Contacts List

![Contacts List](<app/src/main/res/images/Screenshot%20(3844).png>)

### Contact Details Modal

![Contact Modal](<app/src/main/res/images/Screenshot%20(3845).png>)

### Delete Confirmation Dialog

![Delete Dialog](<app/src/main/res/images/Screenshot%20(3846).png>)

### Add Contact Screen

![Add Contact](<app/src/main/res/images/Screenshot%20(3847).png>)

---

# 🏗 Architecture

This project follows **MVVM (Model-View-ViewModel)** architecture.

```
UI (Activity / Fragment)
        │
        ▼
ViewModel
        │
        ▼
Repository
        │
        ▼
Room Database (DAO)
```

### Why MVVM?

- Cleaner code
- Easier testing
- Better lifecycle management
- Scalable architecture

---

# 🧰 Tech Stack

| Technology              | Purpose                          |
| ----------------------- | -------------------------------- |
| **Java**                | Core programming language        |
| **Room Database**       | Local database persistence       |
| **LiveData**            | Reactive UI updates              |
| **ViewModel**           | Lifecycle aware state management |
| **Data Binding**        | Bind UI directly to data         |
| **Material Components** | Modern UI components             |
| **RecyclerView**        | Display contact list             |

---

# 📂 Project Structure

# File Tree: Section 29 MVVM + ROOM DB - Contacts Manager App

**Generated:** 4/17/2026, 4:49:29 PM
**Root Path:** `e:\Full-Stack Mobile App Development\Android App Development by Abbass Masri\Android Mobile App Development\Section 29 MVVM + ROOM DB - Contacts Manager App`

```
├── 📁 app
│   ├── 📁 src
│   │   ├── 📁 androidTest
│   │   │   └── 📁 java
│   │   │       └── 📁 com
│   │   │           └── 📁 example
│   │   │               └── 📁 contactsmanagerapp
│   │   │                   └── ☕ ExampleInstrumentedTest.java
│   │   ├── 📁 main
│   │   │   ├── 📁 java
│   │   │   │   └── 📁 com
│   │   │   │       └── 📁 example
│   │   │   │           └── 📁 contactsmanagerapp
│   │   │   │               ├── ☕ AddNewContactActivity.java
│   │   │   │               ├── ☕ AddNewContactClickHandler.java
│   │   │   │               ├── ☕ ContactDAO.java
│   │   │   │               ├── ☕ ContactDatabase.java
│   │   │   │               ├── ☕ Contacts.java
│   │   │   │               ├── ☕ FirstFragment.java
│   │   │   │               ├── ☕ MainActivity.java
│   │   │   │               ├── ☕ MainActivityClickHandlers.java
│   │   │   │               ├── ☕ MyAdapter.java
│   │   │   │               ├── ☕ MyViewModel.java
│   │   │   │               ├── ☕ Repository.java
│   │   │   │               └── ☕ SecondFragment.java
│   │   │   ├── 📁 res
│   │   │   │   ├── 📁 drawable
│   │   │   │   │   ├── ⚙️ avatar_circle.xml
│   │   │   │   │   ├── ⚙️ ic_launcher_background.xml
│   │   │   │   │   └── ⚙️ ic_launcher_foreground.xml
│   │   │   │   ├── 📁 images
│   │   │   │   │   ├── 🖼️ Screenshot (3844).png
│   │   │   │   │   ├── 🖼️ Screenshot (3845).png
│   │   │   │   │   ├── 🖼️ Screenshot (3846).png
│   │   │   │   │   └── 🖼️ Screenshot (3847).png
│   │   │   │   ├── 📁 layout
│   │   │   │   │   ├── ⚙️ activity_add_new_contact.xml
│   │   │   │   │   ├── ⚙️ activity_main.xml
│   │   │   │   │   ├── ⚙️ contact_detail_modal.xml
│   │   │   │   │   ├── ⚙️ contact_list_item.xml
│   │   │   │   │   ├── ⚙️ content_add_new_contact.xml
│   │   │   │   │   ├── ⚙️ dialog_delete_contact.xml
│   │   │   │   │   ├── ⚙️ fragment_first.xml
│   │   │   │   │   └── ⚙️ fragment_second.xml
│   │   │   │   ├── 📁 mipmap-anydpi-v26
│   │   │   │   │   ├── ⚙️ ic_launcher.xml
│   │   │   │   │   └── ⚙️ ic_launcher_round.xml
│   │   │   │   ├── 📁 mipmap-hdpi
│   │   │   │   │   ├── 🖼️ ic_launcher.webp
│   │   │   │   │   └── 🖼️ ic_launcher_round.webp
│   │   │   │   ├── 📁 mipmap-mdpi
│   │   │   │   │   ├── 🖼️ ic_launcher.webp
│   │   │   │   │   └── 🖼️ ic_launcher_round.webp
│   │   │   │   ├── 📁 mipmap-xhdpi
│   │   │   │   │   ├── 🖼️ ic_launcher.webp
│   │   │   │   │   └── 🖼️ ic_launcher_round.webp
│   │   │   │   ├── 📁 mipmap-xxhdpi
│   │   │   │   │   ├── 🖼️ ic_launcher.webp
│   │   │   │   │   └── 🖼️ ic_launcher_round.webp
│   │   │   │   ├── 📁 mipmap-xxxhdpi
│   │   │   │   │   ├── 🖼️ ic_launcher.webp
│   │   │   │   │   └── 🖼️ ic_launcher_round.webp
│   │   │   │   ├── 📁 navigation
│   │   │   │   │   └── ⚙️ nav_graph.xml
│   │   │   │   ├── 📁 values
│   │   │   │   │   ├── ⚙️ colors.xml
│   │   │   │   │   ├── ⚙️ dimens.xml
│   │   │   │   │   ├── ⚙️ strings.xml
│   │   │   │   │   └── ⚙️ themes.xml
│   │   │   │   ├── 📁 values-land
│   │   │   │   │   └── ⚙️ dimens.xml
│   │   │   │   ├── 📁 values-night
│   │   │   │   │   └── ⚙️ themes.xml
│   │   │   │   ├── 📁 values-v23
│   │   │   │   │   └── ⚙️ themes.xml
│   │   │   │   ├── 📁 values-w1240dp
│   │   │   │   │   └── ⚙️ dimens.xml
│   │   │   │   ├── 📁 values-w600dp
│   │   │   │   │   └── ⚙️ dimens.xml
│   │   │   │   └── 📁 xml
│   │   │   │       ├── ⚙️ backup_rules.xml
│   │   │   │       └── ⚙️ data_extraction_rules.xml
│   │   │   └── ⚙️ AndroidManifest.xml
│   │   └── 📁 test
│   │       └── 📁 java
│   │           └── 📁 com
│   │               └── 📁 example
│   │                   └── 📁 contactsmanagerapp
│   │                       └── ☕ ExampleUnitTest.java
│   ├── ⚙️ .gitignore
│   └── 📄 proguard-rules.pro
├── 📁 gradle
│   ├── 📁 wrapper
│   │   ├── 📄 gradle-wrapper.jar
│   │   └── 📄 gradle-wrapper.properties
│   └── ⚙️ libs.versions.toml
├── ⚙️ .gitignore
├── 📝 README.md
├── 📄 gradle.properties
├── 📄 gradlew
├── 📄 gradlew.bat
└── 📄 settings.gradle.kts
```

---

_Generated by FileTree Pro Extension_

### Key Components

**Contacts.java**
Represents the **Room database entity**.

**ContactDAO.java**
Handles **database queries**.

**Repository.java**
Acts as a **data access layer**.

**MyViewModel.java**
Provides data to UI components.

**MyAdapter.java**
RecyclerView adapter for displaying contacts.

---

# 📊 Database (Room)

Example Entity:

```java
@Entity(tableName = "contacts_table")
public class Contacts {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String name;
    private String email;
}
```

Room handles:

- Database creation
- Query abstraction
- Thread safety

---

# 🚀 Getting Started

### 1️⃣ Clone the repository

```bash
git clone https://github.com/yourusername/contacts-manager-android.git
```

---

### 2️⃣ Open in Android Studio

```
File → Open → Select Project Folder
```

---

### 3️⃣ Build the project

```
Gradle Sync
```

---

### 4️⃣ Run the app

Connect an emulator or Android device and press:

```
Run ▶
```

---

# 📦 Dependencies

Major dependencies used in this project:

```gradle
Room Database
Lifecycle ViewModel
LiveData
Material Components
RecyclerView
Data Binding
```

---

# 🎯 Learning Objectives

This project helps developers learn:

- Android **MVVM Architecture**
- Room **database integration**
- **LiveData observation**
- **RecyclerView implementation**
- **Material UI design**
- **Repository pattern**

---

# 🔮 Future Improvements

Possible improvements:

- ✏️ Edit contact feature
- 🔍 Contact search functionality
- ☁️ Cloud sync
- 📞 Phone number support
- 🖼 Profile pictures
- 🌙 Dark mode

---

# 👨‍💻 Author

Satinder Singh Sall
Full-Stack Mobile Developer
Android App Developer

Developed as part of:

**Android Mobile App Development Course**

Instructor: **Abbass Masri**

---

# 📄 License

This project is open-source and available under the **MIT License**.

---

# ⭐ Support

If you found this project helpful:

⭐ Star the repository
🍴 Fork the project
📢 Share with other developers

---
