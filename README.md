# MY JAVA UTILITY PACK
[*dev.ronaldomarques.util.myutility*]  
My personal Java library of small tools for general purpose.  
  
&bnsp;  
  
*Started 201905010000-UTC/GMT/Z-time*  
*Last change 202202131508-UTC/GMT/Z-time*  
  
&bnsp;  
  
## LIST OF CONTENTS
* [Description](#description)
* [RIGHTS, LICENSE AND DISCLAIMER](#rights)
* [Version](#version)
  + [Versioning](#versioning)
  + [Current Version](#current)
  + [Previous Versions and Changelog](#previous)
  + [Future Versions and Roadmap](#future)
* [Author](#author)  
  
&nbsp;  
&nbsp;  
&nbsp;  
  
<a name="description"></a>
## DESCRIPTION
* SUBJECT:        Java library of small tools for general purpose;
* PROJECT NAME:   My Java Utility Pack;
* PRODUCT NAME:   MyUtility.
&nbsp;  
&nbsp;  
&nbsp;  

<a name="rights"></a>
## RIGHTS, LICENSE AND DISCLAIMER:
This file is an integral, indivisible, inseparable part of a particular project, which has its use expressly exclusive to its author, Ronaldo Marques (ronaldomarques@email.com / http://ronaldomarques.dev);  
Any use, sale, rental, distribution, in parts or integral of this project is NOT encouraged;  
This project has the sole purpose of demonstrating knowledge and skills in software development;  
Therefore, the author of this project does NOT recognize or assume any responsibility for the use of it, neither for any possible reflexes or consequence of such use.  
  
&nbsp;  
&nbsp;  
&nbsp;  
  
<a name="version"></a>
## VERSION
<a name="versioning"></a>
### VERSIONING GUIDELINES
In a team project, it is very important to know and follow the specifications of the project version. Although at the moment MyUtility's status is under early development (as it has not its first release version yet 1.0.0-release) its project already is designed under [**_SemVer_** (Semantic Versioning Specification)](http://semver.org/).  
Thus, MyUtility uses **_SemVer_** for its versioning. **_SemVer_** is a specification (set of rules) that tells (or dictates) us how to use the numbers (and some letters) on the _versioning-expression_ (_VerExpr_). More specifically, MyUtility uses the following standardization: **_Major.Minor.Patch-ReleaseStatus+Build_**, where:
* The standard values of **_Major_**, **_Minor_**, and **_Patch_** for the _VerExpr_ are as follows:
  + Positive integer decimal numbers, without zero remaining on the left;
  + **_Major_** version represents wider changes in the project, which affects the main structure of the project, or its main objectives, or the last user API released;
  + **_Minor_** version represents smaller changes in the project, which don't affect above itens, but affect the amount of the application fuatrures with a new one or more, or remove an existing feature previouslly released;
  + **_Patch_** version represents specific changes which goals to fix or improve some feature, or undesired behavior in the application.  
* The standard flags of **_ReleaseStatus_** for the _VerExpr_ are as follows:
  + **_dev_**: in early development, usage not encouraged;
  + **_alpha_**: in development, first test phase, it's encouraged usage for **test only** by people involved with software development, at self-own risk;
  + **_beta_**: in pre-release version, general public usage is acceptable, however, **only for test**, usage is a choice at self-own risk;
  + **_release_**: release version; relatively stable in proportion to the effectiveness of the tests; bugs are possible to appear, so it would come back to a _hotfix-branch_ if needed.
* The standard values of **_Build_** for the _VerExpr_ are as follows:
  + A 12-digit numeric sequence, positive integer decimal digits, formatted somewhat similar to PostgreSQL DateTime YYYYMMDDhhmm;
  + The initial 4 digits (YYYY) represent the year;
  + The next 2 digits (MM) represent the month;
  + The next 2 digits (DD) represent the day;
  + The next 2 digits (hh) represent the hour;
  + The following 2 digits (mm) represent the minutes;
  + All referring to the moment when the developer builds/exports the .JAR library. (* 1)  
  
> Example of **_Build_**: "202103250231".  
  
> (* 1) The numerical sequence _Build_ necessarily refers to Greenwich Mean Time (GMT), also known as Coordinated Universal Time (UTC), or "Z time" or "Zulu time".  
  
> Full example of **_Versioning-Expression_**: `1.2.3-release+202107301409`, meaning `1`._ ._ version fully implemented according to the project and its backlog; added by _ .`2`._ additionals features to the main version, according to the project backlog and its issues priorities in the **_SCRUM life cycle_**; added by _ ._ .`3` patches fixed in this mentioned lastest version following the **_GITFLOW life cycle_**, that means, it is a released version after passed by the tests in **_alpha_** and **_beta_** pre-releases; and finally, it was/would specifically build at the year 2021 month 07 (July) day 30 at 14:09h at UTC/GMT/Z-time/Zulu-time (14hours and 09minutes equal 2p.m and 09minutes in some idioms).  
  
&nbsp;  
&nbsp;  
  
<a name="current"></a>
### CURRENT VERSION
##### 0.6.0-dev, all the features of the previous version, plus:
* Feature: Reading for csv and tcsv files (titled comma separated values);
  + Return of read lines;
    - One line only, by index;
    - Entire iterable lines list.
* Feature: Writing for csv and tcsv files (titled comma separated values);
  + Return of read lines;
    - Appending line, by string;
    - Appending line, by string array;
&nbsp;  
&nbsp;  
  
<a name="previous"></a>
### PREVIOUS VERSION
##### 0.5.0-dev, all the features of the previous version, plus:
* Feature: If-True-Print-Debug-Messages.
* Feature: An wrapper for `java.util.Scanner` object with **four** methods for scanning entries from keyborad, at console;
  + Scanning `int` typed entries;
    - reading the first characters block;
    - reading the entire line.
  + Scanning `String` typed entries;
    - reading the first characters block;
    - reading the entire line.
&nbsp;  
&nbsp;  
  
<a name="future"></a>
### FUTURE VERSIONS
##### 0.7.0-beta, all the features of the previous version, plus:
* Feature: ...;
&nbsp;  
##### 1.0.0-release, all the features of the previous version, plus:
* Feature: ...;  
  
&nbsp;  
&nbsp;  
&nbsp;  
  
<a name="author"></a>
## Thanks for your visit an reading. Atenciously Ronaldo Marques \_/\\_.
###### | https://ronaldomarques.dev | [linkedin @ronaldo marques](https://linkedin.com/in/ropimasi/) | [twitter @ropimasi](https://twitter.com/ropimasi/) | [instagram @ropimasi](https://instagram.com/ropimasi/) | ronaldomarques@email.com |  
&nbsp;  
  
  
  
