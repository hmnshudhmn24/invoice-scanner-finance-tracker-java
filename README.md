
# 🧾 Invoice Scanner & Auto-Finance Tracker

Turn your physical invoices into digital insights! This Java project uses Tesseract OCR to scan invoice images and extract financial data automatically. 💸📈

## ✨ Features

- 📄 Scan invoices (image format)
- 🤖 OCR-powered text extraction using Tesseract
- 📊 Integrate extracted data into a finance dashboard (future enhancement)

## 🛠️ Tech Stack

- Java
- Tesseract OCR (via Tess4J)
- JavaFX (optional for UI)
- Java CLI (console-based prototype)

## 🚀 How to Run

> 💡 Make sure you have Java JDK and Tesseract OCR installed.

### 📁 Step-by-step:

1. **Install Tesseract** (https://github.com/tesseract-ocr/tessdoc)
   - Download and install Tesseract.
   - Set `TESSDATA_PREFIX` environment variable OR point to `tessdata` in code.

2. **Download Tess4J**:
   - Add Tess4J jars and dependencies to your classpath.

3. **Place your invoice image** in the root folder and name it `invoice-sample.png`.

4. **Compile the code**:
   ```bash
   javac -cp ".:tess4j.jar" src/invoicescanner/InvoiceScanner.java
   ```

5. **Run the program**:
   ```bash
   java -cp ".:tess4j.jar:src" invoicescanner.InvoiceScanner
   ```

## 📂 Project Structure

```
invoice-scanner-finance-tracker-java/
├── src/
│   └── invoicescanner/
│       └── InvoiceScanner.java
├── README.md
└── invoice-sample.png (add your invoice image)
```

## 🧠 Future Plans

- PDF support
- JavaFX dashboard
- Auto-categorization and spending summaries
- Export to CSV or database

## 👨‍💻 Author

Crafted with OCR magic and Java love 🧙‍♂️📜
