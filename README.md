# Tucil3_13522134
:smile:**Welcome to Word Ladder Solver by Shabrina Maharani!**:smile:

This program is your ultimate solution-finder for tackling those challenging word ladders! With the power of algorithms like Uniform Cost Search (UCS), Greedy Best-First Search (GBFS), and A*, we're here to make your word journey a breeze. Say goodbye to word ladder woes! My program is here to swiftly find your solution.

**No more puzzling over steps, let's climb that ladder together !** :rocket::rocket::rocket:

## Table of Contents
* [General Info](#general-information)
* [Technologies Used](#technologies-used)
* [Features](#features)
* [Screenshots](#screenshots)
* [Setup](#local-environment-setup)
* [Run GUI](#run-gui)
* [Run CLI](#run-cli)
* [Usage](#usage)
* [Project Status](#project-status)
* [Room for Improvement](#room-for-improvement)
* [Acknowledgements](#acknowledgements)
* [Contact](#contact)


## General Information
This Word Ladder Solver by Shabrina Maharani leverages advanced algorithms to transform one word into another with the minimal number of steps, where each step involves changing a single letter to form a new valid word. This project addresses the challenge of finding efficient paths in the transformation process. The motivation behind this project is to provide a user-friendly, effective tool for solving word ladders, facilitating both educational purposes and recreational use.


## Technologies Used
- Java SE Development Kit (JDK) - version 20.0.2 or later
- Apache Maven - version 3.9.6
  - Installation guide : https://www.baeldung.com/install-maven-on-windows-linux-mac
- VSCode - version 1.89.0 or later


## Features
- **Multiple Algorithm Support:** Users can choose between Uniform Cost Search (UCS), Greedy Best-First Search (GBFS), and A* to find the optimal path between words. This allows for flexibility in approach depending on the user's needs for speed or accuracy.
- **Interactive GUI**: The application features a user-friendly graphical interface that allows easy input of start and end words, selection of the algorithm, and displays the solution path.
- **Real-time Performance Metrics**: After the computation, the tool provides metrics such as the execution time and the number of visited nodes, offering insights into the performance of the chosen algorithm.
- **Export Solutions**: Users can save the solution path along with the performance metrics to a text file for documentation or further analysis.
- **Memory Usage Information**: The tool also displays the memory usage during the computation, helping users understand the resource efficiency of the algorithms.


## Screenshots
![Example screenshot](./img/screenshot.png)
<!-- If you have screenshots you'd like to share, include them here. -->


## Local Environment Setup
1. Clone the project: Start by cloning the repository to your local machine. If you're using Git, you can run:
    ```
      git clone [repository URL]
    ```

  Replace [repository URL] with the link to the project repository.
  
2. Navigate to the project directory:
    ```
      cd Tucil3_13522134
    ```

## RUN GUI
To run the GUI version of the Word Ladder Solver, follow these steps:

1. Ensure the terminal is in the correct directory:
Make sure your terminal or command prompt is navigated to the project directory, e.g., C:/Users/Shabrina Maharani/Documents/4th sem/STIMA/Tucil3_13522134.

2. Setup the application (if there's a setup script):
    ```
      ./setup
    ```
    or
   ```
      "./setup"
    ```
3. Launch the GUI:
    ```
      ./runGUI
    ```
    or
    ```
      "./runGUI"
    ```
This will start the graphical user interface, where you can input start and end words, select an algorithm, and see the solution path.

## RUN CLI
1. Ensure the terminal is in the correct directory:
   Just as with the GUI, ensure you're in the Tucil3_13522134 directory.
   
2. Launch the CLI:
    ```
      ./runCLI
    ```
    or
    ```
      "./runCLI"
    ```

## Usage

### Using the CLI
The CLI (Command-Line Interface) version allows you to interact with the program through a terminal. Here’s how to use it:

1. **Enter the required inputs** as prompted by the CLI. You will need to provide a start word and an end word, and then select the algorithm you wish to use (e.g., UCS, GBFS, or A*). The program will then process these inputs and display the results.

2. **To run another test case in the CLI**:
   - Check the current directory in your terminal. If you are in the `Tucil3_13522134` directory, you can restart the program by typing:
     ```
       "./runCLI"
     ```
   - If your current directory is `src/main/java`, you need to navigate back to the `Tucil3_13522134` directory and do step one or directly execute the Java program:
     ```
       java CLI/Main
     ```

### Using the GUI
The GUI (Graphical User Interface) provides a more visual and interactive way to use the Word Ladder Solver. Here’s how to operate it:

1. **Enter the Start Word and End Word**: Input the words you want to transform from and to in the designated fields.

2. **Click the 'FIND!' button**: After entering the words, select the algorithm from the dropdown menu and click the 'FIND!' button to start the solving process.

3. **Wait for the result**: The solution path, if available, will be displayed in the solution area. You will also see performance metrics such as execution time and the number of nodes visited.

4. **Save the solution**: If you want to save the solution for later reference, click the 'Save solution to file.txt!' button. You will be prompted to enter a filename and choose a location to save the file.

5. **Run new test cases**: To test new word pairs, simply change the Start Word and End Word in their respective fields and click 'FIND!' again.


## Project Status
_complete_


## Room for Improvement
1. **Algorithm Optimization**: For both UCS and GBFS algorithms, performance improvements can be achieved by refining how nodes are handled and using more efficient data structures. Implementing pruning techniques to cut off paths that do not lead to an optimal solution could also enhance efficiency.
   
2. **Extended Testing**: Conducting tests with larger and more varied datasets to ensure the robustness of the algorithms, especially under more complex and diverse conditions, is crucial for verifying solution stability and accuracy.

3. **Heuristic Implementation**: For GBFS, exploring alternative heuristics that might provide more accurate estimations and reduce the likelihood of getting stuck in local minima would be beneficial.

## To Do
1. **Development of Additional Features**: Introducing features like visual animations of the word transformation process can make the application more interactive and engaging for users.

2. **Multi-language Support**: Expanding the program to support multiple languages could broaden its applicability and usability, catering to a global audience.

3. **User Experience Enhancements**: Improving the GUI with more intuitive controls, better error handling, and feedback mechanisms to make the application more user-friendly and responsive.

These improvements and additions would not only enhance the current functionality of your Word Ladder Solver but also increase its appeal and utility for a broader user base.


## Acknowledgements
- This project was inspired by an assignment provided by the teaching assistants of the STIMA course, challenging us to create efficient solutions to the word ladder problem.
- Special thanks to Pak Rila Mandala and Pak Monterico Adrian, the lecturers of the STIMA course, whose expert guidance and insights have been invaluable in shaping this project.
- Many thanks to all the peers and colleagues who provided support and feedback throughout the development of this program. Your contributions have been essential to its success.


## Contact
Created by [@Maharanish](instragram.com/maharanishhh) - I warmly welcome any suggestions for further improvements to this program. Please feel free to contact me if you have ideas or feedback; I'm always open to hearing from you!


## Author
Shabrina Maharani (13522134) <br>
   - GitHub: [Maharanish](https://github.com/Maharanish)
