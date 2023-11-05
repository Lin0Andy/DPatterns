<h2 align="center">Design Patterns project</h2>

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

<br><h3>UML Diagram: </h3>
<p></p>
