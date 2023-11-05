<h1 align="center">Design Patterns project</h1>

<p>This project is a simplified simulation of the diagnostic and treatment process for various illnesses. The <b>main purpose</b> is to provide insight into how modern medicine functions, highlighting its challenges and potential areas for improvement. The inspiration for this project draws from the game <i>"Plague Inc"</i>, which simulates the global spread of diseases. It can serve as a tool for identifying weaknesses and potential threats in the defense against pandemics and diseases due to it's terrifyingly realistic epidemic model.</p>

<br><h3>Key Design Patterns:</h3>

<h5>Strategy Pattern:</h5>
<p>Implemented in the Illness and Treatment interfaces, allowing different illnesses and treatments to have different strategies for treatment, diagnosis, damage, and symptom retrieval.</p>
<p>Strategy pattern is neccessary for illnesses and treatments, because the amount of possible diseases or medicine to treat them are huge. Without strategy pattern it would be a mess.</p>

<h5>Singleton Pattern:</h5>
<p>Utilized in the Person class to ensure that there is only one instance of a person throughout the application, reflecting the real-world scenario of an individual seeking medical advice and treatment.</p>

<h5>Decorator Pattern:</h5>
<p>Illustrated by the Decorator hierarchy and its concrete implementations (HairLoss, WeightChange, etc.). This pattern is used to modify the appearance of an illness and demonstrate the potential aesthetic impacts of certain medical conditions.</p>

<h5>Observer Pattern:</h5>
<p>Implemented through the ObserverPattern interface and the Analysis class, allowing observers (in this case, the Person class) to receive updates regarding their health status and treatment options.</p>

<h5>Adapter Pattern:</h5>
<p>Demonstrated in the CountryMedicineAdapter class, which adapts prescriptions based on the user's country. This pattern enables compatibility between different prescription formats and systems.</p>

<h5>Factory Method Pattern:</h5>
<p>Employed in the PrescriptionFactory and its concrete subclasses (USPrescriptionFactory, UKPrescriptionFactory). This pattern facilitates the creation of different types of prescriptions based on the user's country.</p>

<br><h3>Project Objectives:</h3>

<h5>Simulate Medical Process:</h5>
<p>The project aims to simulate a simplified version of the diagnostic and treatment process, providing users with an interactive experience akin to seeking medical advice.</p>

<h5>Highlight Medical Challenges:</h5>
<p>By modeling the complexities of diagnosing and treating illnesses, the project aims to showcase the difficulties and vulnerabilities within the field of medicine.</p>

<h5>Encourage Critical Thinking:</h5>
<p>Users are encouraged to think critically about the diagnosis and treatment options presented, mirroring the decision-making process individuals face when seeking medical care.</p>

<h5>Explore Potential Improvements:</h5>
<p>Through the implementation of various design patterns, the project seeks to suggest potential enhancements and innovations that could be integrated into real-world medical practices.</p>

<br><h3>Importance of Design Patterns:</h3>
<p>Design patterns are essential in software development as they provide proven solutions to common design problems. They enhance code readability, maintainability, and reusability, ultimately leading to more robust and scalable applications. In this project, the use of design patterns helps to organize the codebase, clarify the relationships between different components, and facilitate future modifications or extensions. By employing these patterns, the project demonstrates best practices in software design and promotes a structured approach to problem-solving.</p>

<br><br><h2>UML Diagram: </h2>
<img src="images/diagram.jpg" alt="UML Diagram" title="UML Diagram">


<br><br><h2>Conclusion</h2>
<h3>Purpose:</h3>
<p>The project simulates a simplified version of the diagnostic and treatment process for various illnesses. It aims to provide insight into how modern medicine functions and highlight its challenges and potential areas for improvement.</p>

<br><h3>Patterns Used:</h3>

<h5>Strategy Pattern:</h5>
<p>Implemented in the Illness interface, allowing different illnesses to have different strategies for diagnosis, damage, and symptom retrieval.</p>
<h5>Singleton Pattern:</h5> 
<p>Ensures that there is only one instance of a person throughout the application, reflecting the real-world scenario of an individual seeking medical advice and treatment.</p>
<h5>Decorator Pattern:</h5> 
<p>Illustrated by the Decorator hierarchy and its concrete implementations (HairLoss, WeightChange, etc.). Used to modify the appearance of an illness and demonstrate the potential aesthetic impacts of certain medical conditions.</p>
<h5>Observer Pattern:</h5>
<p>Implemented through the ObserverPattern interface and the Analysis class, allowing observers (in this case, the Person class) to receive updates regarding their health status and treatment options.</p>
<h5>Adapter Pattern:</h5> 
<p>Demonstrated in the CountryMedicineAdapter class, which adapts prescriptions based on the user's country. Enables compatibility between different prescription formats and systems.</p>
<h5>Factory Method Pattern:</h5>
<p>Employed in the PrescriptionFactory and its concrete subclasses (USPrescriptionFactory, UKPrescriptionFactory). Facilitates the creation of different types of prescriptions based on the user's country.</p>

<br><h3>Outcomes:</h3>

<p>The project successfully creates a simplified medical simulation, allowing users to input their symptoms and receive a diagnosis and potential treatment options.
It showcases the use of various design patterns to organize and enhance the codebase, promoting best practices in software design.</p>

<br><h3>Challenges Faced:</h3>
<h5>Adapter and Factory Method Implementation:</h5> 
<p>These patterns presented challenges in terms of finding appropriate use cases and integrating them into the project.</p>
<h5>Decorator Realization:</h5> 
<p>While the initial idea for using the decorator pattern for both illness and treatment was ambitious, it required adjustments. Eventually, it was focused solely on illnesses.</p>
<h5>UML Diagram:</h5> 
<p>Creating a comprehensive UML diagram proved to be a challenge, requiring careful consideration of class relationships and structure.</p>

<br><h3>Ideas for Future Enhancements or Improvements:</h3>
<h5>Expand Illness and Treatment Options:</h5>
<p>Introduce a wider range of illnesses and corresponding treatments to provide a more comprehensive simulation.</p>
<h5>Enhance User Interaction:</h5>
<p>Implement a more interactive and intuitive user interface, potentially with graphics or animations.</p>
<h5>Introduce Real-Time Updates:</h5>
<p>Incorporate real-time updates on the user's condition, allowing for dynamic changes based on treatment choices and disease progression.</p>
<h5>Incorporate Machine Learning:</h5>
<p>Consider integrating machine learning algorithms to enhance the diagnostic process and simulate a more intelligent medical system.</p>
<h5>Multi-Language Support:</h5>
<p>Implement functionality to accommodate users from different linguistic backgrounds, potentially including translation features.</p>
<h5>Real-World Data Integration:</h5>
<p>Integrate real-world medical data to make the simulation more accurate and reflective of actual medical practices.</p>
<h5>User Profiles and History:</h5>
<p>Allow users to create profiles, save their medical history, and track their progress through multiple sessions.</p>
