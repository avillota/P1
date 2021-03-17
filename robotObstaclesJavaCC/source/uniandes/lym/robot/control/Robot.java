/* Generated By:JavaCC: Do not edit this line. Robot.java */
package uniandes.lym.robot.control;

import uniandes.lym.robot.kernel.*;
import java.awt.Point;
import java.io.*;
import java.util.Vector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;


@SuppressWarnings("serial")
public class Robot implements RobotConstants {

        public  ArrayList<String> funciones = new ArrayList<String>();
        public  HashMap<String, Integer > variables= new HashMap<String, Integer>();

        public  HashMap<String, String > param= new HashMap<String, String>();
        private RobotWorldDec world;


        void setWorld(RobotWorld w) {
                world = (RobotWorldDec) w;
        }

  final public boolean command(StringBuffer sistema) throws ParseException {
                int x=0;
                String salida=new String();
                String nombreVariable="";

                String nombreFuncion="";
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PI:
      jj_consume_token(PI);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case T_TURNRIGHT:
        jj_consume_token(T_TURNRIGHT);
        jj_consume_token(PI);
        jj_consume_token(PD);
                                   world.turnRight();salida = "Comando GIRAR DER";
        break;
      case WALK:
        x = walk();
                       world.moveForward(x); salida = "el comando walk fue ejecutado y el robot camin\u00f3 "+x+" pasos";
        break;
      default:
        jj_la1[0] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(PD);
                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        System.err.format("IOException: %s%n", e);
                                    }

                        sistema.append(salida);
                        {if (true) return true;}
      break;
    case 0:
      jj_consume_token(0);
                         {if (true) return false;}
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public void objetoPoner() throws ParseException {
                int f=1;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case T_CHIPS:
      jj_consume_token(T_CHIPS);
      jj_consume_token(40);
      f = numero();
                                               world.putChips(f);
      break;
    case T_BALLOONS:
      jj_consume_token(T_BALLOONS);
      jj_consume_token(40);
      f = numero();
                                                           world.putBalloons(f);
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void objetoRecoger() throws ParseException {
                int f=1;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case T_CHIPS:
      jj_consume_token(T_CHIPS);
      jj_consume_token(40);
      f = numero();
                                              world.pickChips(f);
      break;
    case T_BALLOONS:
      jj_consume_token(T_BALLOONS);
      jj_consume_token(40);
      f = numero();
                                                           world.grabBalloons(f);
      break;
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

        /**
	 *  reconoce un numero entero sin signo
	 * @return el valor entero correspondiente al valor reconocido
	 */
  final public int numero() throws ParseException, Error {
                int total=1;
    jj_consume_token(CONSTANT);
                        try
                        {
                                total = Integer.parseInt(token.image);
                        }
                        catch (NumberFormatException ee)
                        {
                                // Dada la forma de NUMERO, sabemos que solo puede tener d�gitos
                                // Por lo tanto, lo unico que podria pasar es que el numero sea muy grande
                                {if (true) throw new Error("Numero demasiado grande: "+token.image+"!!");}
                        }
                        {if (true) return total;}
    throw new Error("Missing return statement in function");
  }

  final public int usarVariable() throws ParseException, Error {
         int rta;
    jj_consume_token(ID);
    if(variables.containsKey(token.image)){
      rta=variables.get(token.image);
    }
    else { {if (true) throw new Error("la variable "+token.image+" no ha sido definida");} }
    {if (true) return rta;}
    throw new Error("Missing return statement in function");
  }

  final public int walk() throws ParseException {
         int rta;
    jj_consume_token(WALK);
    rta = numero();
            {if (true) return rta;}
    throw new Error("Missing return statement in function");
  }

  final public int one_line() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PI:
      jj_consume_token(PI);
      action();
      break;
      definitionVariable();
      break;
      definitionFuncion();
      break;
      condition();
      break;
      usarFuncion();
      jj_consume_token(PD);
 {if (true) return 0 ;}
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public void action() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case WALK:
    case DROP:
    case FREE:
    case PICK:
    case GRAB:
    case WT:
      numericAction();
      break;
    case ROT:
    case LOOK:
      directionAction();
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void numericAction() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case WALK:
    case DROP:
    case FREE:
    case PICK:
    case GRAB:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case WALK:
        jj_consume_token(WALK);
        break;
      case DROP:
        jj_consume_token(DROP);
        break;
      case FREE:
        jj_consume_token(FREE);
        break;
      case PICK:
        jj_consume_token(PICK);
        break;
      case GRAB:
        jj_consume_token(GRAB);
        break;
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CONSTANT:
        jj_consume_token(CONSTANT);
        break;
      case ID:
        usarVariable();
        break;
      default:
        jj_la1[7] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    case WT:
      jj_consume_token(WT);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CONSTANT:
        jj_consume_token(CONSTANT);
        break;
      case ID:
        usarVariable();
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      cardinal();
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void directionAction() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ROT:
      jj_consume_token(ROT);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IZQ:
        jj_consume_token(IZQ);
        break;
      case DER:
        jj_consume_token(DER);
        break;
      case BACK:
        jj_consume_token(BACK);
        break;
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    case LOOK:
      jj_consume_token(LOOK);
      cardinal();
      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void cardinal() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NORTH:
      jj_consume_token(NORTH);
      break;
    case SOUTH:
      jj_consume_token(SOUTH);
      break;
    case EAST:
      jj_consume_token(EAST);
      break;
    case WEST:
      jj_consume_token(WEST);
      break;
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void definitionVariable() throws ParseException {
    jj_consume_token(PI);
    jj_consume_token(DEF);
    variable();
    jj_consume_token(PD);
  }

  final public void definitionFuncion() throws ParseException {
    jj_consume_token(PI);
    jj_consume_token(DEF);
    function();
    jj_consume_token(PD);
  }

  final public void variable() throws ParseException {
  String var = "";
  int valor=0;
    jj_consume_token(ID);
    try
    {
      var = token.toString();

    }
    catch (Exception e){}
    jj_consume_token(CONSTANT);
    try {
      valor=Integer.parseInt(token.toString());
      variables.put(var,valor);
    }
    catch(Exception e) { }
  }

  final public void function() throws ParseException {
  String var = "";
    jj_consume_token(ID);
    try
    {
      var = token.toString();
      funciones.add(var);
    }
    catch (Exception e){}
    jj_consume_token(PI);
    jj_consume_token(ID);
        while(token.toString()!= ")")
        {
        param.put(token.toString(),"");
        token=token.next;
        }
    jj_consume_token(PD);
    block();
  }

  final public void block() throws ParseException {
    jj_consume_token(BLOCK);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case WALK:
      case ROT:
      case LOOK:
      case DROP:
      case FREE:
      case PICK:
      case GRAB:
      case WT:
        action();
        break;
      case PI:
        usarFuncion();
        break;
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case WALK:
      case ROT:
      case LOOK:
      case DROP:
      case FREE:
      case PICK:
      case GRAB:
      case WT:
      case PI:
        ;
        break;
      default:
        jj_la1[14] = jj_gen;
        break label_1;
      }
    }
  }

  final public void usarFuncion() throws ParseException {
    jj_consume_token(PI);
    jj_consume_token(ID);
          try {
        if(!funciones.contains(token.toString()))
        {
          {if (true) throw new Exception("No se ha definido una funcion con ese nombre");}
        }
          }
          catch(Exception e)
          { }
    jj_consume_token(PI);
          int i=0;
           int tama�o=param.keySet().toArray().length;
          String[] parametros=new String[tama�o];

          while(token.toString()!=")")
        {

            param.replace(parametros[i],token.toString());

           i++;
        token=token.next;
        }
    jj_consume_token(PD);
  }

  final public void condition() throws ParseException {
    jj_consume_token(PI);
    jj_consume_token(IF);
    jj_consume_token(PD);
  }

  /** Generated Token Manager. */
  public RobotTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[15];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x240,0x2000001,0x0,0x0,0x2000000,0x1fe00,0xf200,0x0,0x0,0x1f200,0x80000000,0xc00,0x78000000,0x201fe00,0x201fe00,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0xc,0xc,0x0,0x0,0x0,0x50,0x50,0x0,0x3,0x0,0x0,0x0,0x0,};
   }

  /** Constructor with InputStream. */
  public Robot(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Robot(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new RobotTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Robot(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new RobotTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Robot(RobotTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(RobotTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[41];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 15; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 41; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
