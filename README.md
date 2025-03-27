<h1>RideScope | Java Application</h1>

<p>A comprehensive taxi management system built with Java and JavaFX.</p>
<p>This application provides real-time tracking and management of taxi rides, calculating fares, and generating detailed reports.</p>

<h2>Features</h2>
<ul>
  <li><strong>Ride Tracking</strong> - Monitor active rides and their current status</li>
  <li><strong>Duration Calculation</strong> - Automatically track and calculate the duration of each ride</li>
  <li><strong>Location Monitoring</strong> - Track pick-up and drop-off locations for all rides</li>
  <li><strong>Client Management</strong> - Maintain a database of clients with ride history</li>
  <li><strong>Driver Management</strong> - Track driver availability, performance, and earnings</li>
  <li><strong>Fare Calculator</strong> - Automatically calculate fares based on distance, time, and other factors</li>
  <li><strong>Report Generation</strong> - Create detailed reports for rides, earnings, and performance</li>
  <li><strong>Interactive Dashboard</strong> - View key metrics and statistics at a glance</li>
</ul>

<h2>Installation</h2>
<pre>
# Clone the repository
git clone https://github.com/VincentAgra/RideScope-java-app.git

# Navigate to the project directory
cd RideScope-java-app

# Compile the source code
javac -d bin src/*.java

# Run the application
java -cp bin com.ridescope.main.RideScopeApp
</pre>

<h2>Requirements</h2>
<ul>
  <li>Java Development Kit (JDK) 11 or higher</li>
  <li>JavaFX SDK</li>
  <li>MySQL or SQLite for database functionality</li>
  <li>Apache Maven (optional for dependency management)</li>
  <li>Google Maps API key (for map integration)</li>
</ul>

<h2>Usage</h2>
<p>After launching the application:</p>
<ol>
  <li>Log in with your administrator or dispatcher credentials</li>
  <li>View the main dashboard showing active rides and available drivers</li>
  <li>Create a new ride by entering client information and pick-up location</li>
  <li>Assign a driver to the ride or let the system auto-assign based on proximity</li>
  <li>Track the ride progress in real-time on the map interface</li>
  <li>Generate daily, weekly, or monthly reports for business analysis</li>
</ol>

<h2>Project Structure</h2>
<ul>
  <li><strong>src/main/</strong>
    <ul>
      <li><strong>java/</strong> - Java source files
        <ul>
          <li><strong>model/</strong> - Data models for rides, clients, drivers, etc.</li>
          <li><strong>controller/</strong> - Controllers for the JavaFX views</li>
          <li><strong>service/</strong> - Business logic services</li>
          <li><strong>dao/</strong> - Data access objects for database operations</li>
          <li><strong>util/</strong> - Utility classes and helper functions</li>
          <li><strong>event/</strong> - Event handlers and listeners</li>
        </ul>
      </li>
      <li><strong>resources/</strong> - Application resources
        <ul>
          <li><strong>fxml/</strong> - JavaFX layout files</li>
          <li><strong>css/</strong> - Stylesheet definitions</li>
          <li><strong>images/</strong> - Icons and graphics</li>
          <li><strong>config/</strong> - Configuration files</li>
        </ul>
      </li>
    </ul>
  </li>
</ul>

<h2>Technologies Used</h2>
<ul>
  <li><strong>Java</strong> - Primary programming language</li>
  <li><strong>JavaFX</strong> - GUI framework for desktop application</li>
  <li><strong>JDBC</strong> - Database connectivity</li>
  <li><strong>Google Maps API</strong> - For location tracking and mapping</li>
  <li><strong>JUnit</strong> - For unit testing</li>
  <li><strong>Log4j</strong> - Logging framework</li>
  <li><strong>iText</strong> - PDF report generation</li>
  <li><strong>Apache POI</strong> - Excel report generation</li>
</ul>

<h2>Screenshots</h2>
<p>[Screenshots will be added here]</p>

<h2>License</h2>
<p>This project is licensed under the MIT License - see the LICENSE file for details.</p>

<h2>Contact</h2>
<p>Vincent Agra - <a href="mailto:vincent.agra@example.com">vincent.agra@example.com</a></p>
<p>Project Link: <a href="https://github.com/VincentAgra/RideScope-java-app">https://github.com/VincentAgra/RideScope-java-app</a></p>
