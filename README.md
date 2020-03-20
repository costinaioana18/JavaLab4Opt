# JavaLab4Opt
Partea de optional a laboratorului 4 

In clasa Problem am creat algoritmul de creare a unui Match.

Clasa Matching este caraterizata printr-un ArrayList de obiecte de tip Element. Un element are 2 atribute: un Resident si un Hospital.

Am construit cate un ArrayList cu obiecte de tip Resident pentru fiecare spital, in care am adaugat rezidenti in ordinea de preferinta a spitalelor.

Astfel, am incercat sa ocup, pe rand, locurile din spitale, cat timp acestea aveau loc, cu rezidenti, tinand cont de preferinte.

Pe masura ce un rezident este angajat, se creaza un nou element caracterizat de rezidentul respectiv si spitalul la care a fost angajat.

Elementul se adauga la match.

*Meotda workFor() din clasa Resident, care incearca sa angajeze un rezident la un spital, se ocupa de diverse aspecte. Plecand de la verificarea posibilitatii de a face aceasta actiune (daca rezidentul nu e deja angajata sau daca spitalul are locuri valabile), pana la actualizarea informatiilor rezidentului, cat si a spitalului.
