package abook.ajava.ioToy.latex2e;

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
public class Symbol {
  public Symbol() {
  }

  private static void _setInit(Set s, Object[] oa) {
    for (int i = 0; i < oa.length; i++) {
      s.add(oa[i]);
    }
  }

  static java.util.Vector v = new java.util.Vector();
  // class
  static HashSet classSet = new HashSet();
  // String arrays for initialization
  static String[] classNames = {
      "article",
      "book",
      "letter",
      "ltxdoc",
      "ltxguide",
      "ltnews",
      "minimal",
      "proc",
      "report",
      "slides"
  };

  static boolean isValidClass(String arg) {
    return classSet.contains(arg);
  }

  // class option
  static HashSet classOptionSet = new HashSet();
  static String[] classOptions = {
      "10pt", "11pt", "12pt",
      "a4paper", "a5paper", "b5paper", "letterpaper", "legalpaper",
      "executivepaper",
      "landscape", // default portrait
      "titlepage", "notitlepage",
      "leqno", // eq no on left side ,default equation number on right side
      "fleqn", // displayed formula flush left, default is centered.
      "openbib",
      "draft", "final",
      // Not available in slides class
      "oneside", "twoside",
      "openright", "openany",
      "onecolumn", "twocolumn"
  };

  static boolean isValidClassOption(String arg) {
    return classOptionSet.contains(arg);
  }

  // Package
  static HashSet packageSet = new HashSet();
  static String[] packageNames = {
      "afterpage", // t
      "array", // t - tool
      "alltt",
      "amsmath", // ns - non standard, related softwares
      "babel", // ns
      "bm", // t
      "cite", // ns
      "dcolumn", // t
      "delarray", // t
      "doc",
      "enumerate", // t
      "exscale",
      "float", // ns
      "fontenc",
      "fontsmpl", // t
      "ftnright", // t
      "graphics", // ns
      "graphpap",
      "hhline", // t
      "hthtml", // ns
      "indentfirst", // t
      "ifthen",
      "inputenc",
      "layout", // t
      "multicol", // t
      "latexsym",
      "longtable", // t
      "makeidx",
      "mfnfss", // ns
      "moreverb", // ns
      "newlfont",
      "oldlfont",
      "rawfonts", // t
      "psfig", // ns
      "psnfss", // ns
      "showidx",
      "showkeys", // t
      "somedefs", // t
      "syntonly",
      "tabularx", // t
      "theorem", // t
      "tools", // ns
      "tracefnt",
      "texnames", // ns
      "varioref", // t
      "verbatim", // t
      "xr", // t
      "xspace" // t
  };

  static boolean isValidPackage(String arg) {
    return packageSet.contains(arg);
  }

  static HashSet packageOptionSet = new HashSet();
  static String[] packageOptions = {

  };

  static boolean isValidPackageOption(String arg) {
    // TO DO:
    return true;
  }

  static boolean isValidPackageOption(String packageName, String arg) {
    // TO DO:
    return true;
  }

  // Initial commands
  static HashSet initialCommandSet = new HashSet(); // Sebelum documentclass
  private static String[] initialCommands = {
      "begin",
      "end",
      "title",
      "date",
      "author"
  };

  static boolean isValidInitialCommand(String arg) {
    return initialCommandSet.contains(arg);
  }

  // Environment
  static HashSet envSet = new HashSet(); // Untuk begin - end
  static String[] envs = {
      "abstract",
      "array",
      "center",
      "document",
      "description",
      "enumerate",
      "eqnarray",
      "equation",
      "erbatim",
      "erse",
      "figure",
      "flushleft",
      "flushright",
      "itemize",
      "letter",
      "list",
      "minipage",
      "picture",
      "quote",
      "tabbing",
      "table",
      "tabular",
      "thebibliography",
      "theorem",
      "uotation",
      "uote",

      "verbatim",
      "verse"
  };
  static boolean isValidEnv(String arg) {
    return envSet.contains(arg);
  }

  // Argumented Command
  static HashSet argCommandSet = new HashSet(); // \command{<arg>}
  private static String[] argCommands = {
      "arg",
      "author",
      "usepackage",
      "section",
      "subsection",
      "subsubsection"
  };

  static boolean isValidArgCommand(String arg) {
    return argCommandSet.contains(arg);
  }

  // Single Command
  static HashSet singleCommandSet = new HashSet();
  private static String[] singleCommands = {
      "newpage",
      "clearpage",
      "cleardoublepage",
      "clearemptydoublepage",
      "newline",
      "frontmatter",
      "mainmatter",
      "backmatter"
  };

  static boolean isValidSingleCommand(String arg) {
    return singleCommandSet.contains(arg);
  }

  // Pair commands
  static HashSet pairCommandSet = new HashSet();
  private static String[] pairCommands = {
      "$",
      "$$"
  };

  static boolean isValidPairCommand(String arg) {
    return pairCommandSet.contains(arg);
  }

  static HashSet commandSet = new HashSet();


  // Specific commands

  // Page style
  // Page 31, A Guide to Latex
  private String[] pageStyles = {
      "plain",
      "empty",
      "headings",
      "myheading"
  };
  static HashSet pageStyleSet = new HashSet();
  static boolean isValidPageStyle(String style) {
    return pageStyleSet.contains(style);
  }


  // Page numbering
  // Page 32, A Guide to Latex
  private String[] numStyles = {
      "arabic",
      "roman",
      "Roman",
      "alph",
      "Alph"
  };
  static HashSet numStyleSet = new HashSet();
  static boolean isValidNumStyle(String numstyle) {
    return numStyleSet.contains(numstyle);
  }

  static HashSet lengthCommandSet = new HashSet();
  static HashSet lengthSpecSet = new HashSet();

  // Specific
  private static String[] lengthSpecs = {
      "cm", // centimeter
      "mm",
      "in", // 1 in = 2.54 cm
      "pt", // point, 1 in = 72.27 pt
      "bp", // big point, 1 in = 72 bp
      "pc", // pica, 1 pc = 12 pt
      "dd", // didot point, 1157 = 1238 pt
      "cc", // cicero, 1 cc = 12 dd
      "em", // a font specific size,
      "ex"
  };

  // Special command strings
  private static String[] lengthCommands = {
      "textwidth"
  };

  static {
    _symbolInit();
  };

  private static void _symbolInit() {
    _setInit(classSet, classNames);
    _setInit(classOptionSet, classOptions);
    _setInit(packageSet, packageNames);
    _setInit(packageOptionSet, packageOptions);
    _setInit(initialCommandSet, initialCommands);
    _setInit(argCommandSet, argCommands);
    _setInit(singleCommandSet, singleCommands);
    _setInit(pairCommandSet, pairCommands);
    _setInit(envSet, envs);
  }

}
