# Metriikat käytänteiden tukena ohjelmiston laadun arvioimisessa

Kasper Hirvikoski käsittelee kandidaattityössään Metriikat käytänteiden tukena ohjelmiston laadun arvioimisessa ohjelmistojen laadun varmistamista erilaisilla metriikoilla, kuten koodikirnu, verkkoanalyysi, testikattavuus ja mutaatiotestaus. Hirvikoski esittää metriikoiden tarpeellisuuden perussyyksi sen, että ohjelmien virheiden korjaaminen on sitä helpompaa ja halvempaa mitä aiemmin ne huomataan.

Koodikirnu pyrkii kuvaamaan ohjelman eri osien virheherkkyyttä tutkimalla muun muassa, paljonko muutoksia kuhunkin ohjelman komponenttiin tehdään, paljonko koodirivejä on, kuinka montaako niistä on muokattu ja niin edelleen. On huomattu, että näiden mittarien pohjalta muodostetut suhteelliset mitat antavat hyvän kuvan virhemäärän kasvusta. Suuret ja useat muutokset johtavat virheherkkyyden kasvuun.

Verkkoanalyysissa ohjelman komponenttien suhteet mallinnetaan verkkoina. Mitä enemmän riippuvuuksia on, sitä virhealttiimpia komponentit ovat.

Testikattavuus kuvaa sitä osuutta koodista, joka on testattu automaattisilla testeillä. Suurempi testikattavuus johtaa harvempaan virheilmoitukseen valmiissa ohjelmassa. Testikattavuuden lähestyessä 100%:a kuitenkin vaiva kasvaa eksponentiaalisesti mutta hyödyt vain lineaarisesti.

Mutaatiotestaus arvioi testien laatua testaamalla, huomaavatko testit pienet muutokset koodissa. Muttatiotestauksen avulla voi parantaa testien laatua, mutta mutantteja on usein valtavasti, mikä voi tehdä relevanttien muutosten löytämisestä haastavaa.

Näiden lisäksi Hirivkoski käsittelee kehittäjien käytänteitä, jotka voivat parantaa koodin laatua. Näitä ovat ketterä kehitys, testilähtöinen kehitys sekä pariohjelmointi.

