# Termlyser

A comprehensive web application that analyzes Terms & Conditions documents to identify privacy risks and data usage concerns. The tool helps users understand the implications of legal agreements by automatically flagging high-risk clauses and providing detailed analysis.

## 🌟 Features

- **Document Analysis**: Upload PDF, DOC, DOCX, and TXT files (up to 10MB) for automated analysis
- **Text Input**: Paste terms & conditions text directly for quick analysis
- **Risk Assessment**: Automatically categorizes clauses as High Risk, Medium Risk, or Low Risk
- **Privacy Focus**: Identifies privacy concerns, data collection practices, and user rights issues
- **Detailed Reporting**: Provides comprehensive analysis with recommendations for each flagged clause
- **User-Friendly Interface**: Clean, intuitive React-based frontend with real-time processing feedback

## 🚀 Live Demo

The application is deployed and accessible at: https://terms-conditions-frontend.vercel.app/

**⚠️ Note**: The backend API is hosted on Render's free tier, which may cause the application to take 3-4 minutes to respond if it hasn't been accessed for an extended period (typically after a few hours of inactivity). The frontend on Vercel loads instantly, but API calls may experience this initial delay.

## 🛠️ Tech Stack

### Backend
- **Spring Boot** - Java-based backend framework
- **Java** - Core programming language
- **Maven** - Dependency management and build tool
- **PostgreSQL** - Database for storing analysis results
- **Apache Tika** - Document parsing and text extraction

### Frontend
- **React** - Modern JavaScript library for building user interfaces
- **JavaScript/JSX** - Frontend development
- **CSS** - Styling and responsive design

### Deployment
- **Vercel** - Frontend deployment and hosting
- **Render** - Backend API hosting

## 📋 Prerequisites

- Java 11 or higher
- Node.js 14+ and npm
- PostgreSQL 12+
- Maven 3.6+

## 📖 Usage

### Document Upload
1. Click "Choose file" to select a document (PDF, DOC, DOCX, TXT)
2. Ensure file size is under 10MB
3. Click "Upload & Analyze" to process the document

### Text Analysis
1. Paste your terms & conditions text in the provided textarea
2. Click "Analyze Text" to start processing
3. Wait for the analysis to complete (processing indicator will show progress)

### Understanding Results

The application categorizes findings into three risk levels:

- 🔴 **High Risk**: Clauses that pose significant privacy concerns or grant extensive rights to the service provider
- 🟡 **Medium Risk**: Clauses with moderate privacy implications that warrant attention
- 🟢 **Low Risk**: Standard clauses with minimal privacy concerns

Each flagged clause includes:
- Detailed explanation of the privacy concern
- Specific recommendations for users
- Risk assessment reasoning

## 🏗️ Project Structure

```
Terms-Conditions-Analyser/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/demo/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── model/
│   │   │       └── repository/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   └── test/
├── frontend/
│   ├── src/
│   │   ├── components/
│   │   ├── services/
│   │   └── App.js
│   └── package.json
├── pom.xml
└── README.md
```

## 🎯 Key Components

### Backend Services
- **DocumentAnalysisService**: Processes uploaded documents using Apache Tika
- **TextAnalysisService**: Analyzes text content for privacy risks
- **RiskAssessmentService**: Categorizes and scores privacy concerns
- **RecommendationService**: Generates user-friendly recommendations

### Frontend Components
- **FileUploader**: Handles document upload functionality
- **TextAnalyzer**: Manages direct text input and analysis
- **ResultsDisplay**: Shows analysis results with risk categorization
- **ClauseDetails**: Displays detailed information for each flagged clause

## 🚀 Deployment

The application is configured for deployment on Render:

1. **Database**: PostgreSQL database hosted on Render
2. **Backend**: Spring Boot application deployed as a web service
3. **Frontend**: React application served statically

## ⚡ Performance Notes

- **Cold Start**: Applications on Render's free tier "sleep" after 15 minutes of inactivity
- **Wake-up Time**: Expect 3-4 minutes for the application to become responsive after extended inactivity
- **File Processing**: Large documents may take additional time to process depending on complexity

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the Apache License 2.0 - see the LICENSE file for details.

## 👩‍💻 Author

**Nishtha Doshi**
- GitHub: [@NishthaDoshi](https://github.com/NishthaDoshi)

## 🔮 Future Enhancements

- [ ] Multi-language support for international terms & conditions
- [ ] Machine learning improvements for better risk assessment
- [ ] Export functionality for analysis reports
- [ ] User accounts and analysis history

## 📞 Support

If you encounter any issues or have questions:

1. Check the [Issues](https://github.com/NishthaDoshi/Terms-Conditions-Analyser/issues) page
2. Create a new issue with detailed information about the problem
3. Include steps to reproduce the issue and expected behavior

---

*Made with ❤️ to help users understand their digital privacy rights*
