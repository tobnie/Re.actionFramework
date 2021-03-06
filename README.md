# Re.actionFramework
### Re.action a domain specific language for specifying rule-based simulations of biochemical processes
Modern biochemistry opens new perspectives in understanding and finding remedies for diseases like
cancer, diabetes or Alzheimer’s, where regulatory mechanisms of cells in an organism’s metabolism
fail. This is made possible due to broad and highly specialized knowledge in biochemical contexts,
obtained by computer-based simulations of diverse cell and enzyme interactions.
For example, the general-purpose tool [SimSG](https://github.com/Echtzeitsysteme/SimSG) can perform the simulation of such interactions via the rule-based method. 
Herein, the behavior of complex biochemical process in a system is split into several reoccuring patterns, to be
completely modeled and simulated by the use of pattern matching tools and the according model
transformations.
Already existent and well-established specifications such as Kappa or the BioNetGenLanguage provide
extensive possibilities to model such systems and simulations employing domain-specific languages.
Still, these have issues in terms of their usability and are, to an extend, unintuitive to use.
In regard to those parameters the new specification language Re.action and a corresponding
framework for integrating it into the already existent simulation tool SimSG was developed and implemented.

### This repository provides the *Re.action* language including the necessary framework for integrating and using it with the Tool [SimSG](https://github.com/Echtzeitsysteme/SimSG).

## Requirements
* Java SE 8 or higher
 * Eclipse Modeling Tools
* Working [eMoflon](https://github.com/eMoflon/emoflon-ibex) setup
* [SimSG](https://github.com/Echtzeitsysteme/SimSG)

If you don't already have a working setup of eMoflon it is recommended to start with a fresh and clean install of eclipse as provided by the [Eclipse Modeling Tools](https://www.eclipse.org/downloads/packages/release/2020-06/r/eclipse-modeling-tools).
 
## How to Use

1. Install eMoflon as provided [here](https://github.com/eMoflon/emoflon-ibex#how-to-install) in the "How to Install"-section.
2. Install SimSG as provided [here](https://github.com/Echtzeitsysteme/SimSG)
3. Checkout this repository (https://github.com/Echtzeitsysteme/Re.actionFramework) into the workspace containing SimSG. It is recommended to use the .psf-file for that
4. Create the necessary language artifacts. To do so, find the `ReactionLanguage.xtext` in `org.reaction.dsl`, right-click it and choose `"Run as.." -> "Generate Xtext Artifacts"`.
5. Create all necessary models by running the corresponding `.genmodel`-workflows. These include:
    * `org.reaction.intermediatemodel -> model -> IntermediateModel.genmodel`
    * `org.reaction.reactionmodel -> model -> ReactionModel.genmodel`
    * Open both of them in the editor, right-click the top-level item and choose `Generate Model Code`
6. Done! You can now start a dynamic workspace supporting SimSG and Re.action by running any SimSG-project as Eclipse Application

### Creating and running your own models
To create your own models in *Re.action* and run their corresponding simulation in SimSG, follow these steps:
* Open a dynamic workspace by right-clicking any project in your workspace and running it as Eclipse Application.
* In this dynamic workspace, create a new SimSG project via `File -> New -> Project... -> SimSG -> New SimSG Project Wizard`
* Create a new `.react`-file in the src-folder and specify your model in there
* While in the SimSG perspective, select your project and click on the "Build selected projects fully" button or right-click your project and choose `SimSG -> Build selected projects fully` (works in any perspective)
 * You may have to build the project normally again and refresh (F5) for all errors to disappear (`Project -> Build Project`)
* You can now create any source files in the src-folder to work with your model and the corresponding simulation! If you want to know how to run a simulation, have a look at the [running example](https://github.com/Echtzeitsysteme/Re.actionFramework#running-example).
Any files with the `.react`-extension should be recognized as such by Xtext. Please be aware that maybe not all invalid language components or expressions throw an error or warning message yet. If you encounter any of these, feel free to communicate them via the 'Issues'-section.

### Running example
The [Re.action test repository](https://github.com/Echtzeitsysteme/Re.actionFramework-tests) contains a working example model of the so-called *Goldbeter-Koshland-Loop (GKL)*. You can find it in the `org.reaction.gklExample`-folder. To see it in action, follow the instructions on the repository's readme.

## How to Develop
1. Install eMoflon as instructed [here](https://github.com/eMoflon/emoflon-ibex#how-to-develop) in the "How to Develop"-section.
2. Install SimSG according to [this repository](https://github.com/Echtzeitsysteme/SimSG). Ignore all errors until you have completed each and every of the following steps. If after finishing every step errors still persist, consult the [Troubleshooting-Section](https://github.com/Echtzeitsysteme/Re.actionFramework#troubleshooting).
3. Checkout this repository (https://github.com/Echtzeitsysteme/Re.actionFramework) into the workspace containing eMoflon and SimSG. It is recommended to use the .psf-file for that
4. Create the necessary language artifacts. To do so, find the `ReactionLanguage.xtext` in `org.reaction.dsl`, right-click it and choose `"Run as.." -> "Generate Xtext Artifacts"`.
5. Create all necessary models by running the corresponding `.genmodel`-workflows. These include:
    * `org.reaction.intermediatemodel -> model -> IntermediateModel.genmodel`
    * `org.reaction.reactionmodel -> model -> ReactionModel.genmodel`
    * Open both of them in the editor, right-click the top-level item and choose `Generate Model Code`
6. Done! You can now start a dynamic workspace supporting SimSG and Re.action by running any SimSG-project as Eclipse Application

## Troubleshooting ##
* If your .xtend-files seem somehow corrupted or strangely formatted, make sure to set the editor's textfile encoding to 'Other: UTF-8' in `Window->Preferences->General->Workspace`
* In any case it could be sufficient to try checking for updates even though all requirements were just freshly installed
* If some dependencies in the SimSG-project or elsewhere in your dynamic workspace could not be resolved, make sure that this folder was not already in use by other dynamic workspaces instances of eclipse you somewhen used. If this is the case, delete the folder and restart the dynamic workspace, so all plugin- and metadata will be recreated with the correct configuration.
* If the build of any SimSG-projects fails, delete the project from your workspace, close the workspace and then reopen it. Open the project again and now try building once more. If this does not work immediately, try it several times. Usually it should work after doing it once
* Be careful with the names of your rules. Currently RuleNames ending with "Bound" or "Free" will probably result in a crashing build. This will be fixed ASAP but for now please pay attention to your naming.
