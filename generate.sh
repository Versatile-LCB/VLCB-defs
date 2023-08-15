#!/bin/bash
#set -x

# Although this may seem like a random collection of punctuation it is 
# actually a bash script. I.e. it is executed by the bash command. 
#
# Git Bash may be downloaded as part of the Git tools from 
# https://git-scm.com/downloads
#
# This script produces language specific variants of vlcb-defs.csv

############################
# vlcbdefs.inc
############################
sh ./generate_asm.sh

############################
# vlcbdefs.h
############################
sh ./generate_c.sh

############################
# vlcbdefs.hpp
############################
sh ./generate_cpp.sh

############################
# vlcbdefs.pas
############################
sh ./generate_pas.sh

############################
#  Java files
############################
sh ./generate_java.sh

############################
# vlcbdefs.cs
############################
sh ./generate_cs.sh

############################
# vlcbdefsenums.cs
############################
sh ./generate_cs_enums.sh

############################
# vlcbdefs.py
############################
sh ./generate_py.sh