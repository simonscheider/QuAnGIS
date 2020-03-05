import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        TransformationAlgebraLexer lex = new TransformationAlgebraLexer(new ANTLRFileStream("C:\\Users\\schei008\\.matplotlib\\Documents\\github\\QuAnGIS\\TransformationAlgebra\\AlgebraParsers\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        TransformationAlgebraParser g = new TransformationAlgebraParser(tokens, 49100, null);
        try {
            g.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}