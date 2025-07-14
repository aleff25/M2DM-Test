# M2DM-Test

This is a simple Java project created to serve as a test base for the **M2DM plugin** developed for the **Quasar** tool.

## 🔧 Purpose

The main goal of this repository is to provide a sample Java codebase to test metric extraction and static analysis using the **M2DM plugin**.

## 🧪 What's included

- Simple object-oriented Java classes
- Test code aimed at plugin validation
- Not a functional app — code is meant **only for analysis**

## 🧰 Technologies

- Java 8+
- Maven (optional)
- [Quasar M2DM Plugin](https://github.com/aleff25/quasar-plugin-m2dm)

## ▶️ How to use

1. Clone this repository:
   ```bash
   git clone https://github.com/aleff25/M2DM-Test.git
   ```

2. Open it in your favorite IDE (e.g., IntelliJ, Eclipse).

3. Build or run the project as needed to activate static analysis.

4. Run the M2DM plugin with Quasar to extract metrics from the source code.

## 📦 Example usage with Quasar

```bash
java -jar quasar.jar -i ./M2DM-Test -p m2dm
```

> Replace `quasar.jar` with the correct path to your Quasar tool.
