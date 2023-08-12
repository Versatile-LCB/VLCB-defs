# VLCB-defs
This repo is for the control of MERG VLCB-defs files. It allows a variety of language specific cbus definitions files from a 
single version controlled source CSV file, vlcb-defs.csv

This code is a fork from https://github.com/MERG-DEV/cbusdefs that contains the same
definition files for CBUS. 
This repo builds on CBUSDEFS and adds the definitions used by VLCB.

Do NOT edit any of the language specific VLCB-defs files, edit only vlcb-defs.csv and generate the language files from that.

_generate.sh_ is a Bash script  that can be executed using "Git Bash" which is part of the git download (https://git-scm.com/downloads) or by 
any other suitable Bash shell.

The current _generate.sh_ script produces the following output files from the vlcb-defs.csv:
1.	cbusdefs.h   - C
2.	cbusdefs.inc - Assembler
3.	cbusdefs.pas - Object Pascal (Delphi)
4.  CbusDefs.cs	 - C#.NET 5.0 (Core) solution that contains T4 templates to generate files for C#.
					The generated files should be suitable for .NET Framework projects.
5.	java/\*      - Java
6.  cbusdefs.py  - Python

# New versions of VLCB-defs
VLCB-defs will be updated from time to time, in line with changes to the VLCB spec or addition of new module types and/or manufacturer codes.

TODO: Once VLCB-defs is stable and proven useful, generated zip for each new release shall also be uploaded to the MERG knowledgebase
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

