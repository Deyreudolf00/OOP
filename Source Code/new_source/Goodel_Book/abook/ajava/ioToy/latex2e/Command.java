package abook.ajava.ioToy.latex2e;

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
public class Command {
  private static String[] commands = {
      "begin",
      "end",
      // Preamble
      "documentclass",
      "documentstyle",
      "usepackage",
      "listfiles",
      // setcounter -> Counters

      // Document structure - for book class
      "frontmatter",
      "mainmatter",
      "backmatter",
      // Float
      "suppressfloat",
      // Font changing : text
      "rmfamily",
      "sffamily",
      "ttfamily",
      "mdseries",
      "bfseries",
      "upshape",
      "itshape",
      "slshape",
      "scshape",
      // Font changing : math
      "mathrm",
      "mathnormal",
      "mathcal",
      "mathbf",
      "mathsf",
      "mathtt",
      "mathit",
      // Setting text superscripts
      "textsuperscript",
      // Text commands : all encodings
      "textemdash",
      "r",
      "SS",
      "textcircled",
      "textcompwordmark",
      "textvisiblespace",
      "textexclamdown",
      "textquestiondown",
      "textquotedblleft",
      "textquotedblright",
      "textquoteleft",
      "textquoteright",
      // Text command : T1 encodings
      // Harus usepackage [T1]
      "k",
      "DH",
      "DJ",
      "NG",
      "TH",
      "dh",
      "dj",
      "ng",
      "th",

      "guillemotleft",
      "guillemotright",
      "guilsingtleft",
      "guilsingtright",
      "quotedblbase",
      "quotesinglbase",
      "textguotedbl",
      // Logos
      "LaTeX",
      "LaTeXe",
      // Counters
      "addcounter",
      "alph",
      "arabic",
      "fnsymbol",
      "newcounter",
      "refstepcounter",
      "roman",
      "setcounter",
      "usecounter",
      "value",
      // Cross reference
      "label",
      "pageref",
      "ref",
      // Definitions
      "newcommand",
      "renewcommand", //
      "providecommand",
      "newenvironment",
      "newtheorem",
      "newfont",
      // Footnotes
      "footnote",
      "footnotemark",
      "footnotetext",
      // Layout
      "flushbottom",
      "onecolumn",
      "raggedbottom",
      "twocolumn",
      // Lengths
      "newlength",
      "setlength",
      "addtolength",
      "settodepth",
      "settowidth",
      // Predefined length
      "width", "height", "depth", "totalheight",
      // Letter
      "address",
      "cc",
      "closing",
      "encl",
      "location",
      "makelabels",
      "name",
      "opening",
      "ps",
      "signature",
      "startbreaks",
      "stopbreaks",
      "telephone",
      // Line & page breaking
      // "\\\\", ada di special characters
      "\\-",
      "cleardoublepage",
      "clearpage",
      "enlargethispage",
      "flussy",
      "hyphenation",
      "linebreak",
      "newline",
      "newpage",
      "nolinekbreak",
      "nopagebreak",
      "pagebreak",
      "sloppy",
      // Making paragraph
      "indent",
      "noident",
      "par",
      // Margin notes
      "marginpar",
      // Math
      "math",
      "displaymath",
      "equation",
      // Page styles
      "maketitle",
      "pagenumbering",
      "pagestyle",
      "thispagestyle",
      // Sectioning
      "part",
      "chapter", // Report and book class only
      "section",
      "subsection",
      "subsubsection",
      "paragraph",
      "subparagraph",
      "appendix",
      // Spaces and boxes
      "dotfill",
      "hfill",
      "hrulefill",
      "hspace",
      "addvspace",
      "bigskip",
      "medskip",
      "smallskip",
      "vfill",
      "vspace",
      "fbox",
      "framebox",
      "makebox",
      "mbox",
      "newsavebox",
      "parbox",
      "raisebox",
      "rule",
      "savebox",
      "sbox",
      "usebox",
      // Special characters
      "\\#",
      "\\$",
      "\\%",
      "\\&",
      "\\~",
      "\\\\",
      "\\{",
      "\\}",
      // Splitting the input
      "include",
      "includeonly",
      "input",
      // Table of contents
      "tableofcontents",
      "listoffigures",
      "listoftables", // No \nofiles in document
      "addcontentsline",
      "addtocontents",
      // Terminal input / output
      "typein",
      "typeout",
      // Typefaces
      // Styles
      "textit",
      "sffamily",
      "bfseries",
      "textrm",
      //Sizes
      "tiny",
      "scriptsize",
      "footnotesize",
      "small",
      "normalsize", // default
      "large",
      "Large",
      "LARGE",
      "huge",
      "Huge",
      // Low level font commands
      "fontencoding",
      "fontfamily",
      "fontseries",
      "fontshape",
      "fontsize",
      "selectfont",
      "usefont"
  };

  public Command() {
  }

  public static void main(String[] args) {
    Command command = new Command();
  }
}
