# VLCB-defs
This repo is for the control of MERG VLCB-defs files. It allows a variety of language specific cbus definitions files from a 
single version controlled source CSV file, vlcb-defs.csv

This code is a fork from https://github.com/MERG-DEV/cbusdefs that contains the same
definition files for CBUS. 
This repo builds on CBUSDEFS and adds the definitions used by VLCB.

# Credits
* [cbusdefs](https://github.com/MERG-DEV/cbusdefs) repository: Copyright (C) Pete Brownlow software@upsys.co.uk
* Originally derived from opcodes.h (c) Andrew Crosland.
* CSV version by Ian Hogg inspired by David W Radcliffe.
* Adapted for VLCB by Sven Rosvall.

# Contents

Do NOT edit any of the language specific VLCB-defs files, edit only vlcb-defs.csv and generate the language files from that.

There are a number of generator scripts for each supported programming language.
These generator scripts are Bash scripts that can be executed using "Git Bash" which is part of the git download (https://git-scm.com/downloads) or by 
any other suitable Bash shell.
_generate.sh_ is a "master" script that runs all the generator scripts.
The language specific scripts can be run individually to only generate file(s) for that language.

The current generator script produces the following output files from the vlcb-defs.csv:
1.	vlcbdefs.h   - C and C++ using #define
2.  vlcbdefs_enum.h - C using enum constants
1.	vlcbdefs.hpp - C++ using enum constants
2.	vlcbdefs.inc - Assembler
3.	vlcbdefs.pas - Object Pascal (Delphi)
4.  vlcbcefs.cs	 - C#.NET 5.0 (Core)
5.	java/\*      - Java
6.  vlcbdefs.py  - Python
7.  vlcbdefs.js  - JavaScript

# New versions of VLCB-defs
VLCB-defs will be updated from time to time, in line with changes to the VLCB spec or addition of new module types and/or manufacturer codes.

**TODO**: Once VLCB-defs is stable and proven useful, generated zip for each new release shall also be uploaded to the MERG knowledgebase
(https://www.merg.org.uk/merg_wiki/doku.php?id=vlcb:vlcb-headers). Note: You must be a MERG member to access this page.

# Process to update VLCB-defs
Whenever a new version of VLCB-defs is released then the respective changes in VLCB-defs.csv can be made and the _generate.sh_ script used to 
regenerate the language specific files. Once the language specific files have been generated then all the changes can be pushed back to github 
with a commit comment referencing the version number.

A new branch is created on GitHub for each new release, the GitHub release process is carried out on that branch, which is then merged back into master after
release.

Updates to the original cbusdefs can be merged in to this repo.
Be careful to resolve any conflicts carefully.

Users of this repo can pull a new copy and access the language specific files directly.

A zip of the new generated files can also be uploaded onto the MERG Knowledgebase/Wiki for those who do not use GitHub.

For WIP working towards a new version, a branch can be created for that development and changes applied there.  This means that master will always reflect the latest released version.

Co-ordination of changes to VLCB-defs is currently being managed by Sven Rosvall, sven@rosvall.ie

Version 8x released 12/11/23  Added some module type ids and manufacturer id
Version 8y WIP as of Jan 24, not yet released.

# How to use VLCB-defs in Your Project
Your project will use one of the `vlcbdefs.xxx` files listed above.
Use the file that works best with the programming language you use in your project.

It is important to ensure that your project uses an up-to-date version of the `vlcbdefs.xxx`
file and that it is in sync with your project code.

There are two ways to manage the `vlcbdefs.xxx` file in your project.

## 1) Use a copy of the `vlcbdefs.xxx` file

Copy the `vlcbdefs.xxx` file from the latest VLCB-defs repository into the source code of your project. 

Whenever there is an update to the VLCB-defs repository, copy the updated `vlcbdefs.xxx` 
file to your project and make sure that it still compiles. 
At this point you can change your code to make use of new definitions from VLCB-defs.

Having a copy of `vlcbdefs.xxx` in your project ensures that all code is updated
in a controlled way and your project is consistent.
This makes it easier for other users of your project as they do not need a copy of VLCB-defs.

## 2) Use the VLCB-defs repository

Clone the VLCB-defs repository and reference the required files from your own project. 
Whenever there is an update to VLCB-defs, pull the changes and make sure your project 
still compiles. 

Care must be taken to ensure version compatibility between the VLCB-defs project and 
your own project. 
Any users of your project must ensure they have the correct version of VLCB-defs.

This makes your project smaller as it does not need to include the 'vlcbdefs.xxx' file.

