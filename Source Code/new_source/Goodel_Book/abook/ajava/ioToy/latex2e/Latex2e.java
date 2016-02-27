package abook.ajava.ioToy.latex2e;

import java.io.*;
import java.util.*;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2005</p>
 *
 * <p>Company: jgreenbeans.org</p>
 *
 * @author Bambang Hariyanto
 * @version 1.0
 */

/**
 *
 * <p>Keputusan Perancangan : </p>
 *
 * <p>Description: </p>
 *
 * @author Bambang Hariyanto
 * @version 1.0
 *
 * 1. Beragam ekspresi penulisan
 *    - Satu fungsi statik per perintah
 *    - Fungsi umum
 * 2. Untuk semua fungsi tidak ada pemeriksaan string bernilai null
 *    sehingga pada argumen yang memerlukan string namun tidak ada
 *    nilainya harus dimasukkan empty string ("") bukan null.
 * 3. Fungsi umum dibagi menjadi
 *    - _titledCommand
 *    - _singleCommand
 *    - _pairCommand
 *    - _titledPairCommand
 * 4. Argumen yang digunakan
 *    - arg    - argument
 *    - oArg   - optional argument
 *    - mArg   - mandatory argument
 *
 */

public class Latex2e {
  private static String latexStr = new String();

  public Latex2e() {
  }

  public static void main(String[] args) throws Latex2eException {
    demo();
  }

  public static void demo() throws Latex2eException {
    _demoArticle("d:\\_jgreenpearl\\_output\\hello_world.tex");
  }

  // ***** ***** ***** DEMO  ***** ***** ***** //
  public static void _demoArticle(String filename) throws Latex2eException {
    _documentClass("12pt,a4paper", "article");
    _usePackage("psfig");
    _usePackage("cite");
    _usePackage("latexsym");

    _title("Title of Your Paper");
    _author(
        "Your Name \\\\ \r\n" +
        "Your affiliation \\\\ \r\n" +
        "email: bloggs@cs.uwa.edu.au"
        );
    _date("latest date");
    _beginDocument();
    _maketitle();
    _abstract(
        "A paper should begin with an insightful abstract, written in plain" +
        "English and containing no references. It should state clearly the" +
        "problem under consideration, the motivation for that problem, what you" +
        "have achieved and how, and why your results are interesting.  All this" +
        "in one paragraph too!"
        );

    _section("Introduction");
    _emitString(
        "Here we motivate the problem from scratch. Usually a concrete " +
        "example will do this well. The first paragraph sets the scene " +
        "and states the problem explicitly. It sets up the second paragraph," +
        "which will state explicitly your hypothesis for solving it." +
        "\r\n" +
        "Now comes a short, sharp and succinct exposition of your approach. " +
        "For example, ``It thus seems reasonable to conjecture that a " +
        "combination of the X algorithm and the Y algorithm would produce " +
        "superior results to either algorithm on its own. We show that this is " +
        " indeed the case, and prove that the combined algorithm has complexity, " +
        "on the average, that is an order of magnitude better than either the X " +
        "or the Y algorithm.''"
        );
    _subsection("One approach");
    _emitString(
        "Here we do some more citing~\\cite{Wilbur, Jim} and explaining."
        );
    _subsection("Onother approach");
    _emitString("A different approach~\\cite{Megg, Lee} is described here.");

    _section("Methodology");
    _section("Implementation");
    _emitString("Rumus untuk mencari akar dari");
    _mathFormulae$("ax^2 + bx + c = 0");
    _emitString("adalah");
    _mathFormulae$$("x_{1,2} = \\frac{ -b \\pm \\sqrt {b^2 - 4ac}}{2a}");
    _mathFormulae$("dengan asumsi bahwa", "b^2 - 4ac > 0", ".");

    _section("Conclusion");
    _section("Results");
    _section("Acknowledgements");
    _section("References");

    _thebibliography(null, "9");
    _endDocument();

    IO._writeToFile(filename, latexStr);
  }

  // ***** ***** ***** TEMPLATE  ***** ***** ***** //
  private static void _articleT01() {
  }

  private static void _articleT02() {
  }

  private static void _articleT03() {
  }

  private static void _articleT04() {
  }

  private static void _articleT05() {
  }

  // ***** ***** ***** PREAMBULE  ***** ***** ***** //
  // Commands:
  // \documentclass
  // \documentclass{argument}
  // \documentclass[optional_argument]  --> harus pakai pola 4, oArg diisi ""
  // \documentclass[optional_argument]{argument}
  private static void _documentClass() {
    latexStr = "\\documentclass" + "\r\n";
  }

  private static void _documentClass(String arg) throws Latex2eException {
    // arg = class name
    if (!Symbol.isValidClass(arg)) {
      throw (new Latex2eException());
    }
    latexStr = "\\documentclass" + "{" + arg + "} \r\n";
  }

  private static void _documentClass(String oArg, String arg) throws
      Latex2eException {
    if (!Symbol.isValidClass(arg)) {
      throw (new Latex2eException());
    }

    if (!oArg.equals("")) {
      String str[] = oArg.split(",");
      for (int i = 0; i < str.length; i++) {
        if (!Symbol.isValidClassOption(str[i].trim())) {
          throw (new Latex2eException());
        }
      }
      latexStr = "\\documentclass" + "[" + oArg + "]" + "{" + arg + "}" +
          "\r\n";
    }
    else {
      latexStr = "\\documentclass" + "{" + arg + "}" + "\r\n";
    }
  }

  // ***** ***** ***** INITIAL COMMANDS ***** ***** ***** //
  // Commands:
  // \commandname
  // \commandname{argument}
  // \commandname[optional_argument] -> harus pakai pola 4, oArg diisi ""
  // \commandname[optional_argument]{mandatory_argument}

  private static void _usePackage(String arg) throws Latex2eException {
    if (!Symbol.isValidPackage(arg)) {
      throw (new Latex2eException());
    }
    latexStr += "\\usepackage" + "{" + arg + "}\r\n";
  }

  private static void _usePackage(String oArg, String arg) throws
      Latex2eException {
    if (!Symbol.isValidPackage(arg)) {
      throw (new Latex2eException());
    }

    if (!oArg.equals("")) {
      String str[] = oArg.split(",");
      for (int i = 0; i < str.length; i++) {
        if (!Symbol.isValidPackageOption(str[i].trim())) {
          throw (new Latex2eException());
        }
      }
      latexStr += "[" + oArg + "]" + "{" + arg + "} \r\n";
    }
    else {
      latexStr += "\\usepackage" + "{" + arg + "}\r\n";
    }
  }

  private static void _title(String arg) throws Latex2eException {
    latexStr += "\\title" + "{" + arg + "}\r\n";
  }

  private static void _author(String arg) {
    latexStr += "\\author{" + arg + "}\r\n";
  }

  private static void _date(String arg) {
    latexStr += "\\date{" + arg + "}\r\n";

  }

  // ***** ***** ***** ENVIRONMENT ***** ***** ***** //
  // ***** ***** ***** BEGIN END ***** ***** ***** //
  // Environment
  // \begin{environment}
  // ...
  // \end{environment}

  // \begin{environment} {mandatory environment}
  // ...
  // \end{environment}
  // \begin{environment} [optional environment]
  // ...
  // \end{environment}
  // \begin{environment} {mandatory environment} [optional environment]
  // ...
  // \end{environment}
  // Masing-masing perintah lingkungan merupakan kasus berbeda

  // /document
  private static void _documentBody(String arg) {
    _beginDocument();
    _bodyText(arg);
    _endDocument();
  }

  private static void _beginDocument() {
    latexStr += "\\begin{document} \r\n";
  }

  private static void _endDocument() {
    latexStr += "\\end{document} \r\n";
  }

  private static void _bodyText(String arg) {
    if (arg != null) {
      latexStr += arg + "\r\n";
    }
  }

  // /abstract
  private static void _abstract(String arg) {
    _beginAbstract();
    _abstractText(arg);
    _endAbstract();
  }

  private static void _beginAbstract() {
    latexStr += "\\begin{abstract} \r\n";
  }

  private static void _endAbstract() {
    latexStr += "\\end{abstract} \r\n";
  }

  private static void _abstractText(String arg) {
    latexStr += arg + "\r\n";
  }

  // /array
  private static void _array(String cols, String arg) {
    _beginArray(cols);
    _arrayText(arg);
    _endArray();
  }

  private static void _beginArray(String cols) {
    latexStr += "\\begin{array}" + "}{" + cols + "}\r\n";
  }

  private static void _endArray() {
    latexStr += "\\end{array} \r\n";
  }

  private static void _arrayText(String arg) {
    latexStr += arg + "\r\n";
  }

  // center
  private static void _center(String arg) {
    _beginCenter();
    _centerText(arg);
    _endCenter();
  }

  private static void _beginCenter() {
    latexStr += "\\begin{center}" + "}\r\n";
  }

  private static void _endCenter() {
    latexStr += "\\end{center} \r\n";
  }

  private static void _centerText(String arg) {
    latexStr += arg + "\r\n";
  }

  // description
  private static void _description(String arg) {
    _beginDescription();
    _descriptionText(arg);
    _endDescription();
  }

  private static void _beginDescription() {
    latexStr += "\\begin{description}" + "}\r\n";
  }

  private static void _endDescription() {
    latexStr += "\\end{description} \r\n";
  }

  private static void _descriptionText(String arg) {
    latexStr += arg + "\r\n";
  }

  private static void _item(String label) {
    latexStr += "\\item" + label + "\r\n";
  }

  private static void _item(String oArg, String label) {
    latexStr += "\\item[" + oArg + "] " + label + "\r\n";
  }

  // enumerate
  private static void _enumerate(String arg) {
    _beginEnumerate();
    _enumerateText(arg);
    _endEnumerate();
  }

  private static void _beginEnumerate() {
    latexStr += "\\begin{enumerate}" + "}\r\n";
  }

  private static void _endEnumerate() {
    latexStr += "\\end{enumerate} \r\n";
  }

  private static void _enumerateText(String arg) {
    latexStr += arg + "\r\n";
  }

  // eqnarray
  private static void _eqnarray(String arg) {
    _beginEqnarray();
    _eqnarrayText(arg);
    _endEqnarray();
  }

  private static void _beginEqnarray() {
    latexStr += "\\begin{eqnarray}" + "}\r\n";
  }

  private static void _endEqnarray() {
    latexStr += "\\end{eqnarray} \r\n";
  }

  private static void _eqnarrayText(String arg) {
    latexStr += arg + "\r\n";
  }

  // /equation
  private static void _equation(String arg) {
    _beginEquation();
    _equationText(arg);
    _endEquation();
  }

  private static void _beginEquation() {
    latexStr += "\\begin{equation}" + "}\r\n";
  }

  private static void _endEquation() {
    latexStr += "\\end{equation} \r\n";
  }

  private static void _equationText(String arg) {
    latexStr += arg + "\r\n";
  }

  // /figure
  private static void _figure(String arg) {
    _beginFigure();
    _figureText(arg);
    _endFigure();
  }

  private static void _figure(String oArg, String arg) {
    _beginFigure(oArg);
    _figureText(arg);
    _endFigure();
  }

  private static void _beginFigure() {
    latexStr += "\\begin{figure}" + "}\r\n";
  }

  private static void _beginFigure(String oArg) {
    // oArg = placement
    latexStr += "\\begin{figure}" + "}[" + oArg + "\r\n";
  }

  private static void _endFigure() {
    latexStr += "\\end{figure} \r\n";
  }

  private static void _figureText(String arg) {
    latexStr += arg + "\r\n";
  }

  // /flushleft
  private static void _flushleft(String arg) {
    _beginFlushleft();
    _flushleftText(arg);
    _endFlushleft();
  }

  private static void _beginFlushleft() {
    latexStr += "\\begin{flushleft}" + "}\r\n";
  }

  private static void _endFlushleft() {
    latexStr += "\\end{flushleft} \r\n";
  }

  private static void _flushleftText(String arg) {
    latexStr += arg + "\r\n";
  }

  // /flushright
  private static void _flushright(String arg) {
    _beginFlushright();
    _flushrightText(arg);
    _endFlushright();
  }

  private static void _beginFlushright() {
    latexStr += "\\begin{flushright}" + "}\r\n";
  }

  private static void _endFlushright() {
    latexStr += "\\end{flushright} \r\n";
  }

  private static void _flushrightText(String arg) {
    latexStr += arg + "\r\n";
  }

  // /itemize
  private static void _itemize(String arg) {
    _beginItemize();
    _itemizeText(arg);
    _endItemize();
  }

  private static void _beginItemize() {
    latexStr += "\\begin{itemize}" + "}\r\n";
  }

  private static void _endItemize() {
    latexStr += "\\end{itemize} \r\n";
  }

  private static void _itemizeText(String arg) {
    latexStr += arg + "\r\n";
  }

  // letter
  // TO DO

  // /list
  private static void _list(String arg, String label, String spacing) {
    _beginList(label, spacing);
    _listText(arg);
    _endList();
  }

  private static void _beginList(String label, String spacing) {
    latexStr += "\\begin{list}" + "}{" + label + "}{" + spacing + "}\r\n";
  }

  private static void _endList() {
    latexStr += "\\end{list} \r\n";
  }

  private static void _listText(String arg) {
    latexStr += arg + "\r\n";
  }

  // /minipage
  private static void _minipage(String arg, String width) {
    _beginMinipage(width);
    _minipageText(arg);
    _endMinipage();
  }

  private static void _minipage(String arg, String position, String width) {
    _beginMinipage(position, width);
    _minipageText(arg);
    _endMinipage();
  }

  private static void _beginMinipage(String width) {
    latexStr += "\\begin{minipage}" + "}" + "{" + width + "}\r\n";
  }

  private static void _beginMinipage(String position, String width) {
    latexStr += "\\begin{minipage}" + "}[" + position + "]{" + width + "}\r\n";
  }

  private static void _endMinipage() {
    latexStr += "\\end{minipage} \r\n";
  }

  private static void _minipageText(String arg) {
    latexStr += arg + "\r\n";
  }

  // /picture
  // TODO

  // /tabbing
  // TODO

  // /tabular
  // TODO

  // /thebibliographi
  private static void _thebibliography(String arg, String env) {
    _beginThebibliography(env);
    _thebibliographyText(arg);
    _endThebibliography();
  }

  private static void _beginThebibliography(String mArg) {
    // mArg - mandatory argument
    latexStr += "\\begin{thebibliography} {" + mArg + "}\r\n";
  }

  private static void _endThebibliography() {
    latexStr += "\\end{thebibliography} \r\n";
  }

  private static void _thebibliographyText(String arg) {
    latexStr += arg + "\r\n";
  }

  // /theorem
  // TODO

  // /titlepage
  // TODO

  // /tabular
  // TODO


  // /begin - end umum
  private static void _begin(String arg) throws Latex2eException {
    if (!Symbol.isValidEnv(arg.trim())) {
      throw (new Latex2eException());
    }
    latexStr += "\\begin{" + arg.trim() + "}\r\n";
  }

  private static void _end(String arg) throws Latex2eException {
    if (!Symbol.isValidEnv(arg.trim())) {
      throw (new Latex2eException());
    }
    latexStr += "\\end{" + arg.trim() + "}\r\n";
  }

  // ***** ***** ***** SPECIAL CHARACTER ***** ***** ***** //
  private static void _comment(String comment) {
    latexStr += "%" + comment + "\r\n";
  }

  private static void _mathFormulae$(String s1, String formulaeStr, String s2) {
    latexStr += s1 + " $" + formulaeStr + "$ " + s2 + "\r\n";
  }

  private static void _mathFormulae$(String formulaeStr) {
    latexStr += "$" + formulaeStr + "$\r\n";
  }

  //
  private static void _mathFormulae$$(String formulaeStr) {
    latexStr += "$$" + formulaeStr + "$$\r\n";
  }

  // ***** ***** ***** NON ARGUMENTED COMMANDS ***** ***** ***** //
  private static void _maketitle() {
    latexStr += "\\maketitle\r\n";
  }

  // Paragraph
  private static void _newline() {
    latexStr += "\\newline\r\n";
  }

  private static void _newpage() {
    latexStr += "\\newpage\r\n";
  }

  private static void _clearpage() {
    latexStr += "\\clearpage\r\n";
  }

  private static void _cleardoublepage() {
    latexStr += "\\cleardoublepage\r\n";
  }

  private static void _clearemptydoublepage() {
    latexStr += "\\clearemptydoublepage\r\n";
  }

  // Kelas book dan report
  private static void _tableofcontents() {
    latexStr += "\\tableofcontents\r\n";
  }

  private static void _listoffigures() {
    latexStr += "\\listoffigures\r\n";
  }

  private static void _listoftables() {
    latexStr += "\\listoftables\r\n";
  }

  private static void _frontmatter() {
    latexStr += "\\frontmatter\r\n";
  }

  private static void _mainmatter() {
    latexStr += "\\mainmatter\r\n";
  }

  private static void _backmatter() {
    latexStr += "\\backmatter\r\n";
  }

  // ***** ***** ***** ARGUMENTED COMMANDS ***** ***** ***** //
  // Kelas article
  private static void _section(String arg) {
    latexStr += "\\section{" + arg + "}\r\n";
  }

  private static void _subsection(String arg) {
    latexStr += "\\subsection{" + arg + "}\r\n";
  }

  private static void _subsubsection(String arg) {
    latexStr += "\\subsubsection{" + arg + "}\r\n";
  }

  private static void _paragraph(String arg) {
    latexStr += "\\paragraph{" + arg + "}\r\n";
  }

  private static void _subparagraph(String arg) {
    latexStr += "\\subparagraph{" + arg + "}\r\n";
  }

  // Kelas book dan report
  private static void _part(String arg) {
    latexStr += "\\section{" + arg + "}\r\n";
  }

  private static void _chapter(String arg) {
    latexStr += "\\subsection{" + arg + "}\r\n";
  }

  // Counters

  private static void _addtocounter(String counter, String value) {
    latexStr += "\\addtocounter{" + counter + "}{" + value + "}\r\n";
  }

  private static void _alph(String counter) {
    latexStr += "\\alph{" + counter + "}\r\n";
  }

  private static void _arabic(String counter) {
    latexStr += "\\arabic{" + counter + "}\r\n";
  }

  private static void _fnsymbol(String counter) {
    latexStr += "\\fnsymbol{" + counter + "}\r\n";
  }

  private static void _newcounter(String foo) {
    latexStr += "\\newcounter{" + foo + "}\r\n";
  }

  private static void _newcounter(String foo, String counter) {
    latexStr += "\\newcounter{" + foo + "}[" + counter + "]\r\n";
  }

  private static void _refstepcounter(String counter) {
    latexStr += "\\refstepcounter{" + counter + "}\r\n";
  }

  private static void _roman(String counter) {
    latexStr += "\\roman{" + counter + "}\r\n";
  }

  private static void _settocounter(String counter, String value) {
    latexStr += "\\settocounter{" + counter + "}{" + value + "}\r\n";
  }

  private static void _stepcounter(String counter) {
    latexStr += "\\stepcounter{" + counter + "}\r\n";
  }

  private static void _usecounter(String counter) {
    latexStr += "\\usecounter{" + counter + "}\r\n";
  }

  private static void _value(String counter) {
    latexStr += "\\value{" + counter + "}\r\n";
  }

  // Cross References
  private static void _label(String key) {
    /*
     Prefix
     cha for chapters
     sec for lower-level sectioning commands
     fig for figures
     tab for tables
     eq for equatio
     */
    latexStr += "\\value{" + key + "}\r\n";
  }

  private static void _pageref(String key) {
    latexStr += "\\pageref{" + key + "}\r\n";
  }

  private static void _ref(String key) {
    latexStr += "\\ref{" + key + "}\r\n";
  }

  // Definitions
  /*
   \newcommand{cmd}[args]{definition}
   \newcommand{cmd}[args][default]{definition}
   \renewcommand{cmd}[args]{definition}
   \renewcommand{cmd}[args][default]{definition}
   */

  private static void _newcommand(String key) {
    // TODO :
  }

  private static void _renewcommand(String key) {
    // TODO :
  }

  /*
     TODO:
   */

  /*
    \newenvironment{nam}[args]{begdef}{enddef}
    \newenvironment{nam}[args][default]{begdef}{enddef}
    \renewenvironment{nam}[args]{begdef}{enddef}
   */
  /*
   \newtheorem{env_name}{caption}[within]
   \newtheorem{env_name}[numbered_like]{caption}
   */

  /*
   \newfont{cmd}{font_name}
   */

  // ** Paragraph formatting
  // Page 33, Guide to Latex
  private static void _parskip() {
    latexStr += "\\parskip\r\n";
  }

  private static void _parindent() {
    latexStr += "\\parindent\r\n";
  }

  private static void _baselinestretch() {
    latexStr += "\\baselinestretch\r\n";
  }
  // **

  // ***** ***** ***** SPECIAL COMMANDS ***** ***** ***** //
  private static void _length(String lengthCommand, String lengthSpec) {
  }

  // ***** ***** ***** SPECIAL CHARACTERS ***** ***** ***** //
  private static void _escapeDollar(String chr) {
    // $, &, %, #, -,
    latexStr = "\\" + chr;
  }

  static void _pagestyle(String style) {
    if (Symbol.isValidPageStyle(style)) {
      latexStr += "\\pagestyle{" + style +"}\r\n";
    }
  }

  static void _thispagestyle(String style) {
    if (Symbol.isValidPageStyle(style)) {
      latexStr += "\\thispagestyle{" + style +"}\r\n";
    }
  }

  // ***** ***** ***** GENERAL EMITOR ***** ***** ***** //
  private static void _argCommand(String cmd, String arg) {
    if (Symbol.isValidArgCommand(cmd)) {
      latexStr += "\\" + cmd + "{" + arg + "}\r\n";
    }
  }

  private static void _singleCommand(String cmd) {
    if (Symbol.isValidSingleCommand(cmd)) {
      latexStr += "\\" + cmd + "\r\n";
    }
  }

  private static void _pairCommand(String cmd, String arg) {
    if (Symbol.isValidPairCommand(cmd)) {
      latexStr += cmd + arg + cmd + "\r\n";
    }
  }

  private static void _emitString(String arg) {
    latexStr += arg + "\r\n";
  }
}
