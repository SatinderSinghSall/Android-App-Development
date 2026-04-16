# 🚀 Android MVVM Architecture (Java + XML)

![Android](https://img.shields.io/badge/Android-Architecture-brightgreen)
![Java](https://img.shields.io/badge/Language-Java-blue)
![Architecture](https://img.shields.io/badge/Pattern-MVVM-orange)
![Jetpack](https://img.shields.io/badge/Jetpack-ViewModel%20%7C%20LiveData-purple)
![Build](https://img.shields.io/badge/Build-Gradle-success)

> A **complete guide to Android MVVM Architecture** from **beginner to advanced** using **Java, XML, ViewModel, LiveData, Repository & Room Database**.

---

# 📚 Table of Contents

- What is MVVM
- Why MVVM is used
- MVVM Architecture Diagram
- MVVM Layers Explained
- Project Structure
- Implementation (Step-by-Step)
- Java Code Example
- XML UI Example
- Repository Pattern
- LiveData & ViewModel
- Room Database Integration
- Best Practices
- Advanced MVVM

---

# 🧠 What is MVVM?

**MVVM** stands for:

```
Model
View
ViewModel
```

It is an **Android Architecture Pattern** used to **separate UI from Business Logic**.

This makes your app:

✔ scalable
✔ testable
✔ maintainable
✔ clean

---

# 🏗 MVVM Architecture Diagram

![Image](https://images.openai.com/static-rsc-4/8n_J1nYUSAvvUf14xrnQdA7xaUEHkcRbxNRwc7ML5bbfwLPhZUPk4r5zYToXq9pyOksnmdzPJ93BynWYlsdGnyLk3WQZCnbG4PJiEmKVhmSPatlLu1_v6eEuTvZU11Vd5V6fDd-8w2WvCg-KL3WjMx7kYrM_wpChDBGkfHOyPo1j3hsajKCvEWaDvzU0hYoi?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/ycjvteecKhBJmSYO-PyJytMEgo8iKyNgSUVKFnhksEzM1I1LbuP21UxCVSoOZ7rIBL0YDJEdmug_Q3WQ_zCyI7qNYsJXBJ-ONYCjwXKC3uU_KvbLqjEa3guDDM9-EtpXOiNIWEXobo7-wtTbX5sVQ-ZNgVfJaej2mUo-4MGfh6r-5BWP_FsInPmR3fjtpGOt?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/tsf4OFtIhFd4Ok3_9pLIv7flG7hvfRLQE0jD-o9uEMP0WKvdloP5_8ZsL-OLSpKlLsdGlV6_OPIWMhkCKQA9NK6PpFilqVfCRk2sJXe0vhi9JD2ahZHFx3US6uY8vaW6OO2vLtZ64h0OAPSZ46zOam6tIi0uP5djyNuYMgNNLh_kyFS04pxYaRWGbv2W93S6?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/W5sKHF_mP0ClNHE-_Gr3t4nsEOtOB7p_OI4h9146bHBoOrAHvydFJbbrNBQXoS7MKAzkwtcy9X77kHxhVHNZvvBxbBSiSn-4HzSm97hMqPu8dCAhvryr7nKl1MSkFDwUbhZMOw7VUKctS2JZjG9ShwmwAZql8ZPY5kMMTplj12AFRIM-bBsyXj_LiCDptpxl?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/BdDO4NdKqi0ACz5FsdxIjEtpG2Y4fIsG_kSpGJ3vVZwlKSb7NNyJmZZ8yGpZTv8hAviT67qoxlcpWGLmYPkX3uoPBzmD0m14vNEixUWXUMQpN73NVQsBkn4IhbWrdARA0J0hDcOyMvubCck-iqSOpjnESsqdzvFhl6MxRDM4wCa0ngDzYUoUvlnnP9UZrKly?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/hT3XIx_kq84Zh3hU-NHnVa9b_FmPjrA0JalIchBbMMFLE_TjpCQJ3Z9AyyzRi5_xLWZ1blYRpcEoae8EiSJLys-Jyuff605mgncbuwehziBYEfTjz6ult_sZMXFdTTkMTo3CJuG56M2wevpWteWZvHP50D2p7ixk2aHqpqwFKv-X9iryxphTI9lUY2xEj6fa?purpose=fullsize)

---

# 🔄 MVVM Data Flow

```
User Action
     ↓
View (Activity / Fragment)
     ↓
ViewModel
     ↓
Repository
     ↓
Model / Database / API
```

Data flows back like:

```
Model → Repository → ViewModel → LiveData → View
```

---

# 🧩 MVVM Layers Explained

## 1️⃣ View (UI Layer)

The **View** is responsible for displaying UI.

Examples:

- Activity
- Fragment
- XML Layout

View:

- observes LiveData
- sends user actions to ViewModel

❌ View should NOT contain business logic.

---

## 2️⃣ ViewModel (Business Logic Layer)

ViewModel:

- manages UI related data
- survives configuration changes
- communicates with Repository
- exposes **LiveData**

---

## 3️⃣ Model (Data Layer)

Model represents **data sources**:

- REST APIs
- Room Database
- Firebase
- Local Storage

---

# 📂 Recommended Project Structure

```
com.example.mvvmapp

├── model
│     └── User.java
│
├── repository
│     └── UserRepository.java
│
├── view
│     └── MainActivity.java
│
├── viewmodel
│     └── UserViewModel.java
│
├── database
│     ├── AppDatabase.java
│     └── UserDao.java
```

---

# ⚙️ Step-by-Step MVVM Implementation

---

# 1️⃣ Model Class

`User.java`

```java
public class User {

    private String name;
    private int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
```

---

# 2️⃣ Repository Layer

Repository manages **data sources**.

`UserRepository.java`

```java
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class UserRepository {

    private MutableLiveData<User> userLiveData = new MutableLiveData<>();

    public LiveData<User> getUser(){

        User user = new User("John",25);

        userLiveData.setValue(user);

        return userLiveData;
    }
}
```

---

# 3️⃣ ViewModel

`UserViewModel.java`

```java
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class UserViewModel extends ViewModel {

    private UserRepository repository;
    private LiveData<User> user;

    public UserViewModel(){

        repository = new UserRepository();
        user = repository.getUser();
    }

    public LiveData<User> getUser(){
        return user;
    }
}
```

---

# 4️⃣ View (Activity)

`MainActivity.java`

```java
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

    TextView textName;
    UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textName = findViewById(R.id.textName);

        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);

        userViewModel.getUser().observe(this, user -> {

            textName.setText(user.getName());
        });
    }
}
```

---

# 🎨 XML Layout

`activity_main.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>

<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:gravity="center"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/textName"
        android:text="User Name"
        android:textSize="24sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

</LinearLayout>
```

---

# 🔄 LiveData Explained

**LiveData** is lifecycle aware.

Benefits:

✔ automatic UI updates
✔ lifecycle safe
✔ prevents memory leaks

Example:

```java
LiveData<User> userLiveData;
```

Observer:

```java
userViewModel.getUser().observe(this, user -> {
    textView.setText(user.getName());
});
```

---

# 🗄 MVVM + Room Database

Typical structure:

```
Room Database
     ↓
DAO
     ↓
Repository
     ↓
ViewModel
     ↓
Activity / Fragment
```

---

# 🧱 Example DAO

```java
@Dao
public interface UserDao {

    @Insert
    void insert(User user);

    @Query("SELECT * FROM user_table")
    LiveData<List<User>> getUsers();
}
```

---

# 🧠 Why MVVM is Powerful

| Feature                | Benefit                      |
| ---------------------- | ---------------------------- |
| Separation of Concerns | Clean architecture           |
| Testability            | Easy unit testing            |
| Lifecycle Awareness    | No crashes on rotation       |
| Scalability            | Large apps become manageable |

---

# 🔥 Advanced MVVM Concepts

Advanced Android MVVM usually includes:

✔ **Repository Pattern**
✔ **Room Database**
✔ **Retrofit API**
✔ **Coroutines / RxJava**
✔ **Paging Library**
✔ **Dependency Injection (Hilt/Dagger)**
✔ **Clean Architecture**

---

# 🧠 Real Production Architecture

```
UI
│
├── Activity / Fragment
│
├── ViewModel
│
├── Repository
│
├── Local Data Source (Room)
│
└── Remote Data Source (Retrofit)
```

---

# 📊 Example Full Flow

```
Button Click
     ↓
Activity
     ↓
ViewModel
     ↓
Repository
     ↓
Retrofit API
     ↓
JSON Response
     ↓
LiveData
     ↓
UI Update
```

---

# 🧪 Unit Testing Support

MVVM makes testing easier.

You can test:

- Repository
- ViewModel
- Business Logic

Without launching UI.

---

# 🏁 Conclusion

MVVM helps build **modern Android apps** with:

✔ clean architecture
✔ reusable code
✔ scalable design
✔ lifecycle safety

It is widely used with **Android Jetpack libraries**.

---

# ⭐ If this helped you

Give the repository a ⭐ and keep building awesome Android apps!

---

# Android - Mobile App Development.

---

# 🚀 Android MVVM Architecture — Complete Guide (Java + XML)

![Android](https://img.shields.io/badge/Android-Jetpack-green)
![Java](https://img.shields.io/badge/Language-Java-blue)
![Architecture](https://img.shields.io/badge/Architecture-MVVM-orange)
![Build](https://img.shields.io/badge/Build-Gradle-success)
![License](https://img.shields.io/badge/License-MIT-purple)

> A **complete production-level Android MVVM architecture guide** using **Java, XML, ViewModel, LiveData, Repository, Retrofit, and Room Database**.

This repository demonstrates how to build **scalable, maintainable, and testable Android applications** using modern architecture principles.

---

# 📚 Table of Contents

- Introduction
- MVVM Architecture
- Architecture Diagram
- Data Flow
- Project Structure
- Dependencies
- Implementation
- Model Layer
- Repository Pattern
- ViewModel Layer
- UI Layer (Activity + XML)
- Retrofit API Integration
- Room Database Integration
- LiveData & Lifecycle
- Advanced Architecture
- Best Practices

---

# 🧠 What is MVVM?

**MVVM** stands for:

```
Model
View
ViewModel
```

It is a **software architecture pattern** designed to separate:

| Layer     | Responsibility |
| --------- | -------------- |
| View      | UI             |
| ViewModel | Business Logic |
| Model     | Data Source    |

Benefits:

✔ Clean code
✔ Separation of concerns
✔ Easier testing
✔ Lifecycle awareness
✔ Scalable architecture

---

# 🏗 MVVM Architecture Diagram

![Image](https://images.openai.com/static-rsc-4/8n_J1nYUSAvvUf14xrnQdA7xaUEHkcRbxNRwc7ML5bbfwLPhZUPk4r5zYToXq9pyOksnmdzPJ93BynWYlsdGnyLk3WQZCnbG4PJiEmKVhmSPatlLu1_v6eEuTvZU11Vd5V6fDd-8w2WvCg-KL3WjMx7kYrM_wpChDBGkfHOyPo1j3hsajKCvEWaDvzU0hYoi?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/nGo2_asiVbz_6OkOC9OgKhyLej51K4139jBUPamWw56j93fq1yV2qde7lSrF0VLCHtFPt9iCse_-fYNxfDVcVgAlKjchT9dBYyLkwI6NkooxdrvyvGM-yL4hJcNTztLJaT_vBHqjcdbIrBzWF9MSYKSxtXnwwE-xVmIYKsmuLIZGQl8LV8b6E6jRO-CCjrqN?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/Z2tIBuiDhzajoaEUKDKmeJCjtwxdjhPGJ9Qxyaw3DOuWWEWRgnr1oKLo3kHZNBF6l5ly3KJNvhJj8-xpABpTg7QAkOSyKj0nq1Gp1vChoEjcUyuCAXZs9SlE9pYcBAjZTQSPZJQ3QO3PvMyDvubgGrOt6vcOkMUQ2YBc6Hy3A84n99EHjArjA-utOD-SKoBx?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/W5sKHF_mP0ClNHE-_Gr3t4nsEOtOB7p_OI4h9146bHBoOrAHvydFJbbrNBQXoS7MKAzkwtcy9X77kHxhVHNZvvBxbBSiSn-4HzSm97hMqPu8dCAhvryr7nKl1MSkFDwUbhZMOw7VUKctS2JZjG9ShwmwAZql8ZPY5kMMTplj12AFRIM-bBsyXj_LiCDptpxl?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/hT3XIx_kq84Zh3hU-NHnVa9b_FmPjrA0JalIchBbMMFLE_TjpCQJ3Z9AyyzRi5_xLWZ1blYRpcEoae8EiSJLys-Jyuff605mgncbuwehziBYEfTjz6ult_sZMXFdTTkMTo3CJuG56M2wevpWteWZvHP50D2p7ixk2aHqpqwFKv-X9iryxphTI9lUY2xEj6fa?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/tsf4OFtIhFd4Ok3_9pLIv7flG7hvfRLQE0jD-o9uEMP0WKvdloP5_8ZsL-OLSpKlLsdGlV6_OPIWMhkCKQA9NK6PpFilqVfCRk2sJXe0vhi9JD2ahZHFx3US6uY8vaW6OO2vLtZ64h0OAPSZ46zOam6tIi0uP5djyNuYMgNNLh_kyFS04pxYaRWGbv2W93S6?purpose=fullsize)

---

# 🔄 MVVM Data Flow

```
User Action
     ↓
Activity / Fragment (View)
     ↓
ViewModel
     ↓
Repository
     ↓
Local Database / Remote API
```

Data returns via **LiveData**:

```
API / Database
     ↓
Repository
     ↓
ViewModel
     ↓
LiveData
     ↓
View Updates UI
```

---

# 📁 Production Project Structure

```
com.example.mvvmapp

├── data
│   ├── model
│   │      User.java
│   │
│   ├── repository
│   │      UserRepository.java
│   │
│   ├── remote
│   │      ApiService.java
│   │
│   └── local
│         UserDao.java
│         AppDatabase.java
│
├── ui
│   └── MainActivity.java
│
├── viewmodel
│      UserViewModel.java
```

---

# 📦 Required Dependencies

Add in **app/build.gradle**

```gradle
dependencies {

    implementation "androidx.lifecycle:lifecycle-viewmodel:2.6.2"
    implementation "androidx.lifecycle:lifecycle-livedata:2.6.2"

    implementation "androidx.room:room-runtime:2.6.1"
    annotationProcessor "androidx.room:room-compiler:2.6.1"

    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
}
```

---

# 🧩 Model Layer

Represents application data.

### User Model

```java
public class User {

    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
}
```

---

# 📡 Retrofit API Layer

### API Interface

```java
public interface ApiService {

    @GET("users")
    Call<List<User>> getUsers();
}
```

---

### Retrofit Client

```java
public class RetrofitClient {

    private static Retrofit retrofit;

    public static Retrofit getClient(){

        if(retrofit == null){

            retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.example.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
```

---

# 🗄 Room Database Integration

### Entity

```java
@Entity(tableName = "users")
public class User {

    @PrimaryKey
    public int id;

    public String name;
}
```

---

### DAO

```java
@Dao
public interface UserDao {

    @Insert
    void insert(User user);

    @Query("SELECT * FROM users")
    LiveData<List<User>> getUsers();
}
```

---

### Database

```java
@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();
}
```

---

# 📚 Repository Pattern

Repository acts as **single source of truth**.

```
API
  ↓
Repository
  ↓
ViewModel
```

### UserRepository

```java
public class UserRepository {

    private ApiService apiService;

    public UserRepository(){

        apiService = RetrofitClient
                .getClient()
                .create(ApiService.class);
    }

    public LiveData<List<User>> getUsers(){

        MutableLiveData<List<User>> data = new MutableLiveData<>();

        apiService.getUsers().enqueue(new Callback<List<User>>() {

            @Override
            public void onResponse(Call<List<User>> call,
                                   Response<List<User>> response) {

                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

                data.setValue(null);
            }
        });

        return data;
    }
}
```

---

# 🧠 ViewModel Layer

ViewModel connects **Repository ↔ View**.

```java
public class UserViewModel extends ViewModel {

    private UserRepository repository;
    private LiveData<List<User>> users;

    public UserViewModel(){

        repository = new UserRepository();
        users = repository.getUsers();
    }

    public LiveData<List<User>> getUsers(){
        return users;
    }
}
```

---

# 🎨 UI Layer (Activity)

### MainActivity.java

```java
public class MainActivity extends AppCompatActivity {

    private UserViewModel viewModel;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        viewModel = new ViewModelProvider(this)
                .get(UserViewModel.class);

        viewModel.getUsers().observe(this, users -> {

            if(users != null){

                textView.setText(users.get(0).getName());
            }
        });
    }
}
```

---

# 🖼 XML Layout

### activity_main.xml

```xml
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:gravity="center"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/textView"
        android:text="User Name"
        android:textSize="24sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

</LinearLayout>
```

---

# 🔄 LiveData & Lifecycle

LiveData is **lifecycle-aware observable data**.

Benefits:

✔ prevents memory leaks
✔ auto UI updates
✔ lifecycle safe

Example:

```java
viewModel.getUsers().observe(this, users -> {

    // UI automatically updates
});
```

---

# 🧠 Advanced MVVM Architecture

Production Android apps usually include:

```
UI Layer
   │
ViewModel
   │
Repository
   │
├── Remote Data Source (Retrofit)
│
└── Local Data Source (Room)
```

---

# 🏢 Enterprise Architecture (Used by Large Apps)

```
Activity / Fragment
        │
     ViewModel
        │
     Repository
      /     \
 Local DB   Remote API
  (Room)    (Retrofit)
```

---

# ⚡ Best Practices

✔ Never put business logic in Activity
✔ ViewModel should not reference Activity
✔ Repository handles data
✔ Use LiveData for UI updates
✔ Separate API & DB layers

---

# 🧪 Testing Advantages

MVVM allows easy testing:

- Repository tests
- ViewModel tests
- API tests

Without launching UI.

---

# 🏁 Conclusion

MVVM architecture is the **standard architecture for modern Android development**.

It enables:

✔ scalable apps
✔ maintainable code
✔ clean separation
✔ easier debugging

---

# ⭐ Support

If you found this helpful:

⭐ Star the repository
🍴 Fork it
📢 Share it

---
