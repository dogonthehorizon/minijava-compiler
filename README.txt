================================================================
To set up an Eclipse project for Assignment 2
================================================================
- Run Eclipse.
  - Select (or create) a workspace folder.
    - (Close the "Welcome" window if it is open)
  - New -> Project ... Java ... Java Project
  - Next
  - Project name: asst2
    - Create new project in workspace
    - JRE: should be at least 1.6
    - Project layout: create separate ...
    - Finish
  - Unzip the starter file, creating the folder asst2Starter
  - Drag all folders from asst2Starter/src onto the 'src' icon in the package
    explorer.
    - if it asks, select "copy files and folders", here and elsewhere
      during this setup process
  - Drag the asst2Starter/lib folder onto the 'asst2' icon in the package
    explorer
  - Drag the test file, TestSimp.java onto the 'asst2' icon in the packae
    explorer.
  - Drag the asst2Starter/jars folder onto the 'asst2' icon in the package
    explorer
  - Set up the lib file by:
    - click on the 'asst2' icon in the package explorer.
    - Project -> Properties
    - Java Build Path
    - Libraries tab
    - Add ClassFolder ...
    - click on the check-box that corresponds to lib under the asst2 project
    - OK
    - OK
  - Set up the WrangLR JAR file by:
    - click on the 'asst2' icon in the package explorer.
    - Project -> Properties
    - Java Build Path
    - Libraries tab
    - Add JARs ...
    - open up 'asst2', then 'jars' in the pop-up window
    - click on wrangLRv0_8.jar (or whatever the JAR file name is) in the
      pop-up window
    - OK
    - OK
    
You now should be ready to run WrangLR on the starter-grammar:
  - your WrangLR grammar file is src/parse/MJGrammar.java

================================================================
Running WrangLR on the grammar file
================================================================
 - right-click on GenMJGrammarParser.java under src/gen
 - Run As -> Java Application
   - if it warns you that the project has errors, say "Proceed", as the
     hope is that this fixes the errors.
   - When run on the starter file, it will give a lot of warnings about
       unreachable non-terminals, because a lot of tokens are not used in
       the starter-grammar.
   - This will create (or update) the file MJGrammarParseTable.java in
     the 'parse' folder
   - Select 'asst2' and press the F5 key so that Eclipse does a "refresh",
     and realizes that that file has been created or updated.

================================================================
Running the generated parser.
================================================================
- right-click on Main.java under src/main
- Run As -> Java Application
  - The first time WrangLR will report that is needs a file-name argument, so
    add one:
    - Run -> Run Configurations ...
    - make sure that 'Main' is selected in the left pane
    - Arguments tab
    - Type in the name of the input file followed by "-w" into the
      "Program arguments:" text-field. (E.g., "TestSimp.java -w".)
      - if successful, it will bring up a window that displays the AST
    - Eclipse will remember this argument, so you don't need to do this
      step unless you want to change argument.
