/* Generated By:JavaCC: Do not edit this line. RobotTokenManager.java */
package uniandes.lym.robot.control;
import uniandes.lym.robot.kernel.*;
import java.awt.Point;
import java.io.*;
import java.util.Vector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/** Token Manager. */
public class RobotTokenManager implements RobotConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xfc381fdfe0L) != 0L)
         {
            jjmatchedKind = 32;
            return 1;
         }
         if ((active0 & 0x7802000L) != 0L)
            return 1;
         return -1;
      case 1:
         if ((active0 & 0xfc381f7fe0L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 1;
            return 1;
         }
         if ((active0 & 0x8000L) != 0L)
            return 1;
         return -1;
      case 2:
         if ((active0 & 0xfc38075fe0L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 2;
            return 1;
         }
         if ((active0 & 0x182000L) != 0L)
            return 1;
         return -1;
      case 3:
         if ((active0 & 0xec10074040L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 32;
               jjmatchedPos = 3;
            }
            return 1;
         }
         if ((active0 & 0x28001fa0L) != 0L)
            return 1;
         return -1;
      case 4:
         if ((active0 & 0x10024000L) != 0L)
            return 1;
         if ((active0 & 0xc800051040L) != 0L)
         {
            if (jjmatchedPos != 4)
            {
               jjmatchedKind = 32;
               jjmatchedPos = 4;
            }
            return 1;
         }
         return -1;
      case 5:
         if ((active0 & 0x11040L) != 0L)
            return 1;
         if ((active0 & 0x4800060000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 5;
            return 1;
         }
         return -1;
      case 6:
         if ((active0 & 0x4800020000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 6;
            return 1;
         }
         return -1;
      case 7:
         if ((active0 & 0x4800000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 7;
            return 1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 21);
      case 41:
         return jjStopAtPos(0, 22);
      case 44:
         return jjStopAtPos(0, 40);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x4020024000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x8000080000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x10100L);
      case 69:
      case 101:
         return jjStartNfaWithStates_0(0, 25, 1);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x40200L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x8000080L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 78:
      case 110:
         jjmatchedKind = 23;
         return jjMoveStringLiteralDfa1_0(0x102000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x3000000400L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x10000040L);
      case 83:
      case 115:
         return jjStartNfaWithStates_0(0, 24, 1);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 87:
      case 119:
         jjmatchedKind = 26;
         return jjMoveStringLiteralDfa1_0(0x1020L);
      default :
         return jjMoveNfa_0(2, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x40200c1020L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x8010000L);
      case 70:
      case 102:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(1, 15, 1);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x2010000400L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x24000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x4001020c0L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0xb00L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x1800000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x2020040400L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x8010000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000001020L);
      case 78:
      case 110:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(2, 19, 1);
         break;
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x24180L);
      case 80:
      case 112:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 1);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
      case 84:
      case 116:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(2, 20, 1);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 32, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x40L);
      case 66:
      case 98:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 1);
         break;
      case 67:
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x24000L);
      case 69:
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(3, 9, 1);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 32, 1);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x50000L);
      case 75:
      case 107:
         if ((active0 & 0x20L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 7, 1);
         else if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(3, 29, 1);
         else if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L);
      case 80:
      case 112:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000L);
      case 84:
      case 116:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(3, 27, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 75:
      case 107:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x50000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000L);
      case 83:
      case 115:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 32, 1);
         break;
      case 84:
      case 116:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(4, 28, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x1040L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(5, 6, 1);
         else if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(5, 16, 1);
         return jjMoveStringLiteralDfa6_0(active0, 0x20000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000000L);
      case 79:
      case 111:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(5, 12, 1);
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 63:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(6, 18);
         break;
      case 68:
      case 100:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 63:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(7, 17);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa8_0(active0, 0x800000000L);
      case 83:
      case 115:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 32, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 84:
      case 116:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(8, 32, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 2;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  kind = 30;
                  jjCheckNAdd(0);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  kind = 32;
                  jjCheckNAdd(1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 2 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, "\50", "\51", null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, "\54", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1fd7fffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[2];
private final int[] jjstateSet = new int[4];
protected char curChar;
/** Constructor. */
public RobotTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public RobotTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 2; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
