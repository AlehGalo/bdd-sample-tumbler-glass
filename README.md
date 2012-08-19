bdd-sample-tumbler-glass
========================

This is a sample project of tumbler-glass.  
See [tumbler-glass project page] (http://code.google.com/p/tumbler-glass/wiki/IntroductionForDevelopers).  


Install tumbler-glass
---------------------
Maven installation

    <dependency>
        <groupId>pl.pragmatists.tumbler</groupId>
        <artifactId>tumbler</artifactId>
        <version>0.4.1</version>
    </dependency>


Describe Scenario File
----------------------

**[sample] (https://github.com/mid0111/bdd-sample-tumbler-glass/blob/master/src/test/resource/calcurator_add.scenario)**

+ We can't write the fields "Story" and "Scenario" in japanese.
+ You don't have to describe scenario files, you can also describe test code direct.


Compile Scenario File
---------------------

    $ ls
    calcurator_add.scenario
    $  java -classpath ~/.m2/repository/pl/pragmatists/tumbler/tumbler/0.4.1/tumbler-0.4.1.jar tumbler.ScenarioToJavaConverter calcurator_add.scenario 
    $ ls
    calcurator_add.scenario  calcurator_div.scenario  target
    $ ls target/
    DoAddScenarios.java

**[created file sample] (https://github.com/mid0111/bdd-sample-tumbler-glass/blob/ba530e3c403bda3567b140a5f069b342a22fc7a7/src/test/java/sample/DoAddScenarios.java)**


JUnit
-----

![image1] (https://raw.github.com/mid0111/bdd-sample-tumbler-glass/master/readme/tumbler-Junit.png)

HTML Report
-----------

![image2] (https://raw.github.com/mid0111/bdd-sample-tumbler-glass/master/readme/tumbler-report1.png)
![image3] (https://raw.github.com/mid0111/bdd-sample-tumbler-glass/master/readme/tumbler-report2.png)
