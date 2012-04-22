package org.jnario.spec.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecLexer extends Lexer {
    public static final int RULE_COMMENT_RICH_TEXT_INBETWEEN=12;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=19;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_COMMENT_RICH_TEXT_END=14;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int RULE_HEX=5;
    public static final int T__90=90;
    public static final int RULE_RICH_TEXT_END=13;
    public static final int RULE_DECIMAL=7;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int RULE_IN_RICH_STRING=15;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=16;
    public static final int RULE_STRING=8;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_RICH_TEXT_START=10;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int RULE_RICH_TEXT=9;
    public static final int T__63=63;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=6;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=17;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_RICH_TEXT_INBETWEEN=11;
    public static final int RULE_WS=18;

    // delegates
    // delegators

    public InternalSpecLexer() {;} 
    public InternalSpecLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSpecLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:11:7: ( '=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:12:7: ( '+=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:12:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:13:7: ( '||' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:13:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:14:7: ( '&&' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:14:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:15:7: ( 'extends' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:15:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:16:7: ( 'super' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:16:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:17:7: ( 'def' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:17:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:18:7: ( 'throws' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:18:9: 'throws'
            {
            match("throws"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:19:7: ( '=>' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:19:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:20:7: ( 'create' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:20:9: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:21:7: ( '==' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:21:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:22:7: ( '!=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:22:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:23:7: ( '>=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:23:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:24:7: ( '<=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:24:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25:7: ( '>' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:26:7: ( '<' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:26:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27:7: ( '->' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:28:7: ( '..' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:28:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:29:7: ( '+' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:29:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:30:7: ( '-' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:30:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:31:7: ( '*' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:31:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32:7: ( '**' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:33:7: ( '/' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:33:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:34:7: ( '%' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:34:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:35:7: ( '!' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:35:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:36:7: ( '.' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:36:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:37:7: ( 'val' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:37:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:38:7: ( 'false' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:38:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:39:7: ( 'public' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:39:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:40:7: ( 'protected' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:40:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:41:7: ( 'private' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:41:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:42:7: ( 'package' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:42:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:43:7: ( '{' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:43:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:44:7: ( '}' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:44:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:45:7: ( '(' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:45:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:46:7: ( ')' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:46:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:47:7: ( ',' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:47:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:48:7: ( '[]' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:48:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:49:7: ( '?' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:49:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:50:7: ( 'fact' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:50:9: 'fact'
            {
            match("fact"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:51:7: ( 'before' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:51:9: 'before'
            {
            match("before"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:52:7: ( 'after' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:52:9: 'after'
            {
            match("after"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:53:7: ( '|' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:53:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:54:7: ( 'should' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:54:9: 'should'
            {
            match("should"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:55:7: ( 'throw' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:55:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:56:7: ( 'instanceof' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:56:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:57:7: ( 'not' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:57:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:58:7: ( 'assert' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:58:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:59:7: ( '#' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:59:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:60:7: ( '[' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:60:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:61:7: ( ']' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:61:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:62:7: ( 'import' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:62:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:63:7: ( ';' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:63:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:64:7: ( 'class' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:64:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:65:7: ( 'implements' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:65:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:66:7: ( ':' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:66:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:67:7: ( 'FOR' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:67:9: 'FOR'
            {
            match("FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:68:7: ( 'ENDFOR' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:68:9: 'ENDFOR'
            {
            match("ENDFOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:69:7: ( 'BEFORE' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:69:9: 'BEFORE'
            {
            match("BEFORE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:70:7: ( 'SEPARATOR' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:70:9: 'SEPARATOR'
            {
            match("SEPARATOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:71:7: ( 'AFTER' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:71:9: 'AFTER'
            {
            match("AFTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:72:7: ( 'IF' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:72:9: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:73:7: ( 'ENDIF' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:73:9: 'ENDIF'
            {
            match("ENDIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:74:7: ( 'ELSE' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:74:9: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:75:7: ( 'ELSEIF' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:75:9: 'ELSEIF'
            {
            match("ELSEIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:76:7: ( '@' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:76:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:77:7: ( 'as' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:77:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:78:7: ( 'if' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:78:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:79:7: ( 'else' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:79:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:80:7: ( 'switch' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:80:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:81:7: ( 'default' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:81:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:82:7: ( 'case' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:82:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:83:7: ( 'for' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:83:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:84:7: ( 'while' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:84:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:85:7: ( 'do' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:85:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:86:7: ( '::' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:86:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:87:7: ( 'new' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:87:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:88:7: ( 'null' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:88:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:89:7: ( 'typeof' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:89:9: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:90:7: ( 'return' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:90:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:91:8: ( 'try' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:91:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:92:8: ( 'finally' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:92:10: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:93:8: ( 'catch' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:93:10: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:94:8: ( '&' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:94:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:95:8: ( 'describe' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:95:10: 'describe'
            {
            match("describe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:96:8: ( 'all' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:96:10: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:97:8: ( 'context' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:97:10: 'context'
            {
            match("context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:98:8: ( 'extension' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:98:10: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:99:8: ( 'static' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:99:10: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:100:8: ( 'override' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:100:10: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:101:8: ( 'dispatch' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:101:10: 'dispatch'
            {
            match("dispatch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:102:8: ( '...' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:102:10: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:103:8: ( '?.' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:103:10: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:104:8: ( '*.' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:104:10: '*.'
            {
            match("*."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:105:8: ( 'var' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:105:10: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:106:8: ( 'true' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:106:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "RULE_RICH_TEXT"
    public final void mRULE_RICH_TEXT() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27727:16: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27727:18: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match("'''"); 

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27727:27: ( RULE_IN_RICH_STRING )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\'') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='\'') ) {
                        int LA1_4 = input.LA(3);

                        if ( ((LA1_4>='\u0000' && LA1_4<='&')||(LA1_4>='(' && LA1_4<='\u00AA')||(LA1_4>='\u00AC' && LA1_4<='\uFFFF')) ) {
                            alt1=1;
                        }


                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='&')||(LA1_1>='(' && LA1_1<='\u00AA')||(LA1_1>='\u00AC' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='\u00AA')||(LA1_0>='\u00AC' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27727:27: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27727:48: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\'') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='\'') ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3=='\'') ) {
                        alt4=1;
                    }
                    else {
                        alt4=2;}
                }
                else {
                    alt4=2;}
            }
            else {
                alt4=2;}
            switch (alt4) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27727:49: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27727:58: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27727:58: ( '\\'' ( '\\'' )? )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\'') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27727:59: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27727:64: ( '\\'' )?
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0=='\'') ) {
                                alt2=1;
                            }
                            switch (alt2) {
                                case 1 :
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27727:64: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT"

    // $ANTLR start "RULE_RICH_TEXT_START"
    public final void mRULE_RICH_TEXT_START() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27729:22: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27729:24: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match("'''"); 

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27729:33: ( RULE_IN_RICH_STRING )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\'') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='\'') ) {
                        int LA5_4 = input.LA(3);

                        if ( ((LA5_4>='\u0000' && LA5_4<='&')||(LA5_4>='(' && LA5_4<='\u00AA')||(LA5_4>='\u00AC' && LA5_4<='\uFFFF')) ) {
                            alt5=1;
                        }


                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='&')||(LA5_1>='(' && LA5_1<='\u00AA')||(LA5_1>='\u00AC' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\u00AA')||(LA5_0>='\u00AC' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27729:33: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27729:54: ( '\\'' ( '\\'' )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\'') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27729:55: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27729:60: ( '\\'' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\'') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27729:60: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_START"

    // $ANTLR start "RULE_RICH_TEXT_END"
    public final void mRULE_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27731:20: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27731:22: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match('\u00BB'); 
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27731:31: ( RULE_IN_RICH_STRING )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\'') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='\'') ) {
                        int LA8_4 = input.LA(3);

                        if ( ((LA8_4>='\u0000' && LA8_4<='&')||(LA8_4>='(' && LA8_4<='\u00AA')||(LA8_4>='\u00AC' && LA8_4<='\uFFFF')) ) {
                            alt8=1;
                        }


                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='&')||(LA8_1>='(' && LA8_1<='\u00AA')||(LA8_1>='\u00AC' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='\u00AA')||(LA8_0>='\u00AC' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27731:31: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27731:52: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\'') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='\'') ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3=='\'') ) {
                        alt11=1;
                    }
                    else {
                        alt11=2;}
                }
                else {
                    alt11=2;}
            }
            else {
                alt11=2;}
            switch (alt11) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27731:53: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27731:62: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27731:62: ( '\\'' ( '\\'' )? )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\'') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27731:63: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27731:68: ( '\\'' )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0=='\'') ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27731:68: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_END"

    // $ANTLR start "RULE_RICH_TEXT_INBETWEEN"
    public final void mRULE_RICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27733:26: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27733:28: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match('\u00BB'); 
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27733:37: ( RULE_IN_RICH_STRING )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\'') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='\'') ) {
                        int LA12_4 = input.LA(3);

                        if ( ((LA12_4>='\u0000' && LA12_4<='&')||(LA12_4>='(' && LA12_4<='\u00AA')||(LA12_4>='\u00AC' && LA12_4<='\uFFFF')) ) {
                            alt12=1;
                        }


                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='&')||(LA12_1>='(' && LA12_1<='\u00AA')||(LA12_1>='\u00AC' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='\u00AA')||(LA12_0>='\u00AC' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27733:37: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27733:58: ( '\\'' ( '\\'' )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\'') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27733:59: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27733:64: ( '\\'' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\'') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27733:64: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_COMMENT_RICH_TEXT_INBETWEEN"
    public final void mRULE_COMMENT_RICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27735:34: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )? )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27735:36: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            {
            match("\u00AB\u00AB"); 

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27735:51: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27735:51: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27735:67: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27735:68: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
                    {
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27735:68: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27735:68: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27735:79: ( RULE_IN_RICH_STRING )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\'') ) {
                            int LA17_1 = input.LA(2);

                            if ( (LA17_1=='\'') ) {
                                int LA17_4 = input.LA(3);

                                if ( ((LA17_4>='\u0000' && LA17_4<='&')||(LA17_4>='(' && LA17_4<='\u00AA')||(LA17_4>='\u00AC' && LA17_4<='\uFFFF')) ) {
                                    alt17=1;
                                }


                            }
                            else if ( ((LA17_1>='\u0000' && LA17_1<='&')||(LA17_1>='(' && LA17_1<='\u00AA')||(LA17_1>='\u00AC' && LA17_1<='\uFFFF')) ) {
                                alt17=1;
                            }


                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='\u00AA')||(LA17_0>='\u00AC' && LA17_0<='\uFFFF')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27735:79: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27735:100: ( '\\'' ( '\\'' )? )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\'') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27735:101: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27735:106: ( '\\'' )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0=='\'') ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27735:106: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match('\u00AB'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_COMMENT_RICH_TEXT_END"
    public final void mRULE_COMMENT_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:28: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:30: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            {
            match("\u00AB\u00AB"); 

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:45: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:45: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:61: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\n'||LA27_0=='\r') ) {
                alt27=1;
            }
            else {
                alt27=2;}
            switch (alt27) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:62: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    {
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:62: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:62: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:73: ( RULE_IN_RICH_STRING )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\'') ) {
                            int LA23_1 = input.LA(2);

                            if ( (LA23_1=='\'') ) {
                                int LA23_4 = input.LA(3);

                                if ( ((LA23_4>='\u0000' && LA23_4<='&')||(LA23_4>='(' && LA23_4<='\u00AA')||(LA23_4>='\u00AC' && LA23_4<='\uFFFF')) ) {
                                    alt23=1;
                                }


                            }
                            else if ( ((LA23_1>='\u0000' && LA23_1<='&')||(LA23_1>='(' && LA23_1<='\u00AA')||(LA23_1>='\u00AC' && LA23_1<='\uFFFF')) ) {
                                alt23=1;
                            }


                        }
                        else if ( ((LA23_0>='\u0000' && LA23_0<='&')||(LA23_0>='(' && LA23_0<='\u00AA')||(LA23_0>='\u00AC' && LA23_0<='\uFFFF')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:73: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:94: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='\'') ) {
                        int LA26_1 = input.LA(2);

                        if ( (LA26_1=='\'') ) {
                            int LA26_3 = input.LA(3);

                            if ( (LA26_3=='\'') ) {
                                alt26=1;
                            }
                            else {
                                alt26=2;}
                        }
                        else {
                            alt26=2;}
                    }
                    else {
                        alt26=2;}
                    switch (alt26) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:95: '\\'\\'\\''
                            {
                            match("'''"); 


                            }
                            break;
                        case 2 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:104: ( '\\'' ( '\\'' )? )? EOF
                            {
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:104: ( '\\'' ( '\\'' )? )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0=='\'') ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:105: '\\'' ( '\\'' )?
                                    {
                                    match('\''); 
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:110: ( '\\'' )?
                                    int alt24=2;
                                    int LA24_0 = input.LA(1);

                                    if ( (LA24_0=='\'') ) {
                                        alt24=1;
                                    }
                                    switch (alt24) {
                                        case 1 :
                                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:110: '\\''
                                            {
                                            match('\''); 

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }

                            match(EOF); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27737:123: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_RICH_TEXT_END"

    // $ANTLR start "RULE_IN_RICH_STRING"
    public final void mRULE_IN_RICH_STRING() throws RecognitionException {
        try {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27739:30: ( ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27739:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27739:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\'') ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1=='\'') ) {
                    alt28=1;
                }
                else if ( ((LA28_1>='\u0000' && LA28_1<='&')||(LA28_1>='(' && LA28_1<='\u00AA')||(LA28_1>='\u00AC' && LA28_1<='\uFFFF')) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA28_0>='\u0000' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='\u00AA')||(LA28_0>='\u00AC' && LA28_0<='\uFFFF')) ) {
                alt28=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27739:33: '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match("''"); 

                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27739:59: '\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match('\''); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 3 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27739:83: ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IN_RICH_STRING"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27741:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27741:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27741:12: ( '0x' | '0X' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='0') ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1=='x') ) {
                    alt29=1;
                }
                else if ( (LA29_1=='X') ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27741:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27741:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27741:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='0' && LA30_0<='9')||(LA30_0>='A' && LA30_0<='F')||LA30_0=='_'||(LA30_0>='a' && LA30_0<='f')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27741:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='#') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27741:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27741:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='B'||LA31_0=='b') ) {
                        alt31=1;
                    }
                    else if ( (LA31_0=='L'||LA31_0=='l') ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27741:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27741:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27743:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27743:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27743:21: ( '0' .. '9' | '_' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='0' && LA33_0<='9')||LA33_0=='_') ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27745:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27745:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27745:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='E'||LA35_0=='e') ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27745:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27745:36: ( '+' | '-' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0=='+'||LA34_0=='-') ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27745:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='B'||LA36_0=='b') ) {
                alt36=1;
            }
            else if ( (LA36_0=='D'||LA36_0=='F'||LA36_0=='L'||LA36_0=='d'||LA36_0=='f'||LA36_0=='l') ) {
                alt36=2;
            }
            switch (alt36) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27745:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27745:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27747:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27747:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27747:11: ( '^' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='^') ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27747:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27747:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0=='$'||(LA38_0>='0' && LA38_0<='9')||(LA38_0>='A' && LA38_0<='Z')||LA38_0=='_'||(LA38_0>='a' && LA38_0<='z')) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27749:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27749:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27749:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='\"') ) {
                alt41=1;
            }
            else if ( (LA41_0=='\'') ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27749:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27749:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop39:
                    do {
                        int alt39=3;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0=='\\') ) {
                            alt39=1;
                        }
                        else if ( ((LA39_0>='\u0000' && LA39_0<='!')||(LA39_0>='#' && LA39_0<='[')||(LA39_0>=']' && LA39_0<='\uFFFF')) ) {
                            alt39=2;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27749:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27749:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27749:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27749:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop40:
                    do {
                        int alt40=3;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0=='\\') ) {
                            alt40=1;
                        }
                        else if ( ((LA40_0>='\u0000' && LA40_0<='&')||(LA40_0>='(' && LA40_0<='[')||(LA40_0>=']' && LA40_0<='\uFFFF')) ) {
                            alt40=2;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27749:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27749:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27751:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27751:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27751:24: ( options {greedy=false; } : . )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0=='*') ) {
                    int LA42_1 = input.LA(2);

                    if ( (LA42_1=='/') ) {
                        alt42=2;
                    }
                    else if ( ((LA42_1>='\u0000' && LA42_1<='.')||(LA42_1>='0' && LA42_1<='\uFFFF')) ) {
                        alt42=1;
                    }


                }
                else if ( ((LA42_0>='\u0000' && LA42_0<=')')||(LA42_0>='+' && LA42_0<='\uFFFF')) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27751:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27753:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27753:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27753:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>='\u0000' && LA43_0<='\t')||(LA43_0>='\u000B' && LA43_0<='\f')||(LA43_0>='\u000E' && LA43_0<='\uFFFF')) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27753:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27753:40: ( ( '\\r' )? '\\n' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0=='\n'||LA45_0=='\r') ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27753:41: ( '\\r' )? '\\n'
                    {
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27753:41: ( '\\r' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0=='\r') ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27753:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27755:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27755:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27755:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>='\t' && LA46_0<='\n')||LA46_0=='\r'||LA46_0==' ') ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27757:16: ( . )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27757:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt47=111;
        alt47 = dfa47.predict(input);
        switch (alt47) {
            case 1 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:64: T__29
                {
                mT__29(); 

                }
                break;
            case 11 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:70: T__30
                {
                mT__30(); 

                }
                break;
            case 12 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 13 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 14 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 15 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 16 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 17 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 18 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 19 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:118: T__38
                {
                mT__38(); 

                }
                break;
            case 20 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:124: T__39
                {
                mT__39(); 

                }
                break;
            case 21 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:130: T__40
                {
                mT__40(); 

                }
                break;
            case 22 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:136: T__41
                {
                mT__41(); 

                }
                break;
            case 23 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:142: T__42
                {
                mT__42(); 

                }
                break;
            case 24 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:148: T__43
                {
                mT__43(); 

                }
                break;
            case 25 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:154: T__44
                {
                mT__44(); 

                }
                break;
            case 26 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:160: T__45
                {
                mT__45(); 

                }
                break;
            case 27 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:166: T__46
                {
                mT__46(); 

                }
                break;
            case 28 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:172: T__47
                {
                mT__47(); 

                }
                break;
            case 29 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:178: T__48
                {
                mT__48(); 

                }
                break;
            case 30 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:184: T__49
                {
                mT__49(); 

                }
                break;
            case 31 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:190: T__50
                {
                mT__50(); 

                }
                break;
            case 32 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:196: T__51
                {
                mT__51(); 

                }
                break;
            case 33 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:202: T__52
                {
                mT__52(); 

                }
                break;
            case 34 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:208: T__53
                {
                mT__53(); 

                }
                break;
            case 35 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:214: T__54
                {
                mT__54(); 

                }
                break;
            case 36 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:220: T__55
                {
                mT__55(); 

                }
                break;
            case 37 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:226: T__56
                {
                mT__56(); 

                }
                break;
            case 38 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:232: T__57
                {
                mT__57(); 

                }
                break;
            case 39 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:238: T__58
                {
                mT__58(); 

                }
                break;
            case 40 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:244: T__59
                {
                mT__59(); 

                }
                break;
            case 41 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:250: T__60
                {
                mT__60(); 

                }
                break;
            case 42 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:256: T__61
                {
                mT__61(); 

                }
                break;
            case 43 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:262: T__62
                {
                mT__62(); 

                }
                break;
            case 44 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:268: T__63
                {
                mT__63(); 

                }
                break;
            case 45 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:274: T__64
                {
                mT__64(); 

                }
                break;
            case 46 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:280: T__65
                {
                mT__65(); 

                }
                break;
            case 47 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:286: T__66
                {
                mT__66(); 

                }
                break;
            case 48 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:292: T__67
                {
                mT__67(); 

                }
                break;
            case 49 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:298: T__68
                {
                mT__68(); 

                }
                break;
            case 50 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:304: T__69
                {
                mT__69(); 

                }
                break;
            case 51 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:310: T__70
                {
                mT__70(); 

                }
                break;
            case 52 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:316: T__71
                {
                mT__71(); 

                }
                break;
            case 53 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:322: T__72
                {
                mT__72(); 

                }
                break;
            case 54 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:328: T__73
                {
                mT__73(); 

                }
                break;
            case 55 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:334: T__74
                {
                mT__74(); 

                }
                break;
            case 56 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:340: T__75
                {
                mT__75(); 

                }
                break;
            case 57 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:346: T__76
                {
                mT__76(); 

                }
                break;
            case 58 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:352: T__77
                {
                mT__77(); 

                }
                break;
            case 59 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:358: T__78
                {
                mT__78(); 

                }
                break;
            case 60 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:364: T__79
                {
                mT__79(); 

                }
                break;
            case 61 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:370: T__80
                {
                mT__80(); 

                }
                break;
            case 62 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:376: T__81
                {
                mT__81(); 

                }
                break;
            case 63 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:382: T__82
                {
                mT__82(); 

                }
                break;
            case 64 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:388: T__83
                {
                mT__83(); 

                }
                break;
            case 65 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:394: T__84
                {
                mT__84(); 

                }
                break;
            case 66 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:400: T__85
                {
                mT__85(); 

                }
                break;
            case 67 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:406: T__86
                {
                mT__86(); 

                }
                break;
            case 68 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:412: T__87
                {
                mT__87(); 

                }
                break;
            case 69 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:418: T__88
                {
                mT__88(); 

                }
                break;
            case 70 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:424: T__89
                {
                mT__89(); 

                }
                break;
            case 71 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:430: T__90
                {
                mT__90(); 

                }
                break;
            case 72 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:436: T__91
                {
                mT__91(); 

                }
                break;
            case 73 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:442: T__92
                {
                mT__92(); 

                }
                break;
            case 74 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:448: T__93
                {
                mT__93(); 

                }
                break;
            case 75 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:454: T__94
                {
                mT__94(); 

                }
                break;
            case 76 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:460: T__95
                {
                mT__95(); 

                }
                break;
            case 77 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:466: T__96
                {
                mT__96(); 

                }
                break;
            case 78 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:472: T__97
                {
                mT__97(); 

                }
                break;
            case 79 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:478: T__98
                {
                mT__98(); 

                }
                break;
            case 80 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:484: T__99
                {
                mT__99(); 

                }
                break;
            case 81 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:490: T__100
                {
                mT__100(); 

                }
                break;
            case 82 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:497: T__101
                {
                mT__101(); 

                }
                break;
            case 83 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:504: T__102
                {
                mT__102(); 

                }
                break;
            case 84 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:511: T__103
                {
                mT__103(); 

                }
                break;
            case 85 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:518: T__104
                {
                mT__104(); 

                }
                break;
            case 86 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:525: T__105
                {
                mT__105(); 

                }
                break;
            case 87 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:532: T__106
                {
                mT__106(); 

                }
                break;
            case 88 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:539: T__107
                {
                mT__107(); 

                }
                break;
            case 89 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:546: T__108
                {
                mT__108(); 

                }
                break;
            case 90 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:553: T__109
                {
                mT__109(); 

                }
                break;
            case 91 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:560: T__110
                {
                mT__110(); 

                }
                break;
            case 92 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:567: T__111
                {
                mT__111(); 

                }
                break;
            case 93 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:574: T__112
                {
                mT__112(); 

                }
                break;
            case 94 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:581: T__113
                {
                mT__113(); 

                }
                break;
            case 95 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:588: T__114
                {
                mT__114(); 

                }
                break;
            case 96 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:595: T__115
                {
                mT__115(); 

                }
                break;
            case 97 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:602: RULE_RICH_TEXT
                {
                mRULE_RICH_TEXT(); 

                }
                break;
            case 98 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:617: RULE_RICH_TEXT_START
                {
                mRULE_RICH_TEXT_START(); 

                }
                break;
            case 99 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:638: RULE_RICH_TEXT_END
                {
                mRULE_RICH_TEXT_END(); 

                }
                break;
            case 100 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:657: RULE_RICH_TEXT_INBETWEEN
                {
                mRULE_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 101 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:682: RULE_COMMENT_RICH_TEXT_INBETWEEN
                {
                mRULE_COMMENT_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 102 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:715: RULE_COMMENT_RICH_TEXT_END
                {
                mRULE_COMMENT_RICH_TEXT_END(); 

                }
                break;
            case 103 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:742: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 104 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:751: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 105 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:760: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 106 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:773: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 107 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:781: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 108 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:793: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 109 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:809: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 110 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:825: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 111 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:833: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA47 dfa47 = new DFA47(this);
    static final String DFA47_eotS =
        "\1\uffff\1\72\1\74\1\76\1\100\5\103\1\123\1\125\1\127\1\131\1\133"+
        "\1\136\1\141\1\uffff\3\103\5\uffff\1\160\1\162\4\103\3\uffff\1\u0081"+
        "\6\103\1\uffff\3\103\1\67\1\u0091\1\67\2\u0096\1\67\1\uffff\1\67"+
        "\13\uffff\2\103\1\uffff\5\103\1\u00a1\10\103\10\uffff\1\u00ad\10"+
        "\uffff\7\103\11\uffff\2\103\1\u00bb\3\103\1\u00bf\3\103\5\uffff"+
        "\6\103\1\u00c9\1\uffff\3\103\1\u008e\1\uffff\2\u0091\2\uffff\1\u00d3"+
        "\1\uffff\1\u0096\3\uffff\6\103\1\u00db\1\103\1\uffff\3\103\1\u00e0"+
        "\6\103\2\uffff\1\u00e7\1\u00e8\2\103\1\u00eb\10\103\1\uffff\1\u00f4"+
        "\2\103\1\uffff\1\u00f8\1\u00f9\1\103\1\u00fb\5\103\1\uffff\3\103"+
        "\1\u0107\2\u0091\1\u00d3\1\uffff\1\u010c\1\uffff\1\103\1\u010e\5"+
        "\103\1\uffff\4\103\1\uffff\1\u0118\2\103\1\u011b\2\103\2\uffff\1"+
        "\103\1\u011f\1\uffff\10\103\1\uffff\3\103\2\uffff\1\u012b\1\uffff"+
        "\2\103\1\u012f\6\103\2\u0107\2\uffff\1\u0091\2\u010c\1\uffff\1\103"+
        "\1\uffff\1\u013c\6\103\1\u0144\1\103\1\uffff\1\103\1\u0147\1\uffff"+
        "\1\u0148\1\103\1\u014a\1\uffff\6\103\1\u0151\4\103\1\uffff\1\103"+
        "\1\u0157\1\103\1\uffff\2\103\1\u015b\1\u015c\2\103\2\u0107\2\u010c"+
        "\2\103\1\uffff\1\u0163\1\u0164\1\u0165\3\103\1\u0169\1\uffff\1\u016a"+
        "\1\u016b\2\uffff\1\103\1\uffff\1\103\1\u016e\3\103\1\u0172\1\uffff"+
        "\1\u0173\1\103\1\u0175\1\103\1\u0177\1\uffff\1\u0178\1\u0179\1\103"+
        "\2\uffff\1\u017b\1\103\1\u0107\1\u010c\1\u017d\1\103\3\uffff\1\u017f"+
        "\2\103\3\uffff\1\u0182\1\u0183\1\uffff\1\103\1\u0185\1\u0186\2\uffff"+
        "\1\103\1\uffff\1\103\3\uffff\1\103\1\uffff\1\103\1\uffff\1\103\1"+
        "\uffff\1\u018c\1\u018d\2\uffff\1\103\2\uffff\3\103\1\u0192\1\u0193"+
        "\2\uffff\1\u0194\2\103\1\u0197\3\uffff\1\u0198\1\u0199\3\uffff";
    static final String DFA47_eofS =
        "\u019a\uffff";
    static final String DFA47_minS =
        "\1\0\2\75\1\174\1\46\1\154\1\150\1\145\1\150\1\141\3\75\1\76\1\56"+
        "\2\52\1\uffff\3\141\5\uffff\1\135\1\56\1\145\2\146\1\145\3\uffff"+
        "\1\72\1\117\1\114\2\105\2\106\1\uffff\1\150\1\145\1\166\2\0\1\u00ab"+
        "\2\60\1\44\1\uffff\1\0\13\uffff\1\164\1\163\1\uffff\1\160\1\157"+
        "\1\151\1\141\1\146\1\44\1\163\1\162\1\160\1\165\1\145\1\141\1\163"+
        "\1\156\10\uffff\1\56\10\uffff\1\154\1\143\1\162\1\156\1\142\1\151"+
        "\1\143\11\uffff\1\146\1\164\1\44\1\154\1\163\1\160\1\44\1\164\1"+
        "\167\1\154\5\uffff\1\122\1\104\1\123\1\106\1\120\1\124\1\44\1\uffff"+
        "\1\151\1\164\1\145\1\47\1\uffff\2\0\2\uffff\1\0\1\uffff\1\60\3\uffff"+
        "\3\145\1\165\2\164\1\44\1\143\1\uffff\1\160\1\157\1\145\1\44\1\145"+
        "\1\141\1\163\1\145\1\143\1\164\2\uffff\2\44\1\163\1\164\1\44\1\141"+
        "\1\154\1\164\1\166\1\153\1\157\2\145\1\uffff\1\44\1\164\1\154\1"+
        "\uffff\2\44\1\154\1\44\1\106\1\105\1\117\1\101\1\105\1\uffff\1\154"+
        "\1\165\1\162\4\0\1\12\1\0\1\uffff\1\156\1\44\1\162\1\154\1\143\1"+
        "\151\1\165\1\uffff\1\162\1\141\1\167\1\157\1\uffff\1\44\1\164\1"+
        "\163\1\44\1\150\1\145\2\uffff\1\145\1\44\1\uffff\1\154\1\151\1\145"+
        "\2\141\3\162\1\uffff\1\141\1\162\1\145\2\uffff\1\44\1\uffff\1\117"+
        "\1\106\1\44\3\122\1\145\2\162\2\0\2\uffff\3\0\1\uffff\1\144\1\uffff"+
        "\1\44\1\144\1\150\1\143\1\154\1\151\1\164\1\44\1\146\1\uffff\1\145"+
        "\1\44\1\uffff\1\44\1\170\1\44\1\uffff\1\154\2\143\1\164\1\147\1"+
        "\145\1\44\1\164\1\156\1\164\1\155\1\uffff\1\122\1\44\1\106\1\uffff"+
        "\1\105\1\101\2\44\1\156\1\151\4\0\1\163\1\151\1\uffff\3\44\1\164"+
        "\1\142\1\143\1\44\1\uffff\2\44\2\uffff\1\164\1\uffff\1\171\1\44"+
        "\1\164\2\145\1\44\1\uffff\1\44\1\143\1\44\1\145\1\44\1\uffff\2\44"+
        "\1\124\2\uffff\1\44\1\144\2\0\1\44\1\157\3\uffff\1\44\1\145\1\150"+
        "\3\uffff\2\44\1\uffff\1\145\2\44\2\uffff\1\145\1\uffff\1\156\3\uffff"+
        "\1\117\1\uffff\1\145\1\uffff\1\156\1\uffff\2\44\2\uffff\1\144\2"+
        "\uffff\1\157\1\164\1\122\2\44\2\uffff\1\44\1\146\1\163\1\44\3\uffff"+
        "\2\44\3\uffff";
    static final String DFA47_maxS =
        "\1\uffff\1\76\1\75\1\174\1\46\1\170\1\167\1\157\1\171\1\162\3\75"+
        "\1\76\2\56\1\57\1\uffff\1\141\1\157\1\165\5\uffff\1\135\1\56\1\145"+
        "\1\163\1\156\1\165\3\uffff\1\72\1\117\1\116\2\105\2\106\1\uffff"+
        "\1\150\1\145\1\166\2\uffff\1\u00ab\1\170\1\154\1\172\1\uffff\1\uffff"+
        "\13\uffff\1\164\1\163\1\uffff\1\160\1\157\1\151\1\141\1\163\1\172"+
        "\1\163\1\162\1\160\1\171\1\145\1\141\1\164\1\156\10\uffff\1\56\10"+
        "\uffff\1\162\1\154\1\162\1\156\1\142\1\157\1\143\11\uffff\1\146"+
        "\1\164\1\172\1\154\1\163\1\160\1\172\1\164\1\167\1\154\5\uffff\1"+
        "\122\1\104\1\123\1\106\1\120\1\124\1\172\1\uffff\1\151\1\164\1\145"+
        "\1\47\1\uffff\2\uffff\2\uffff\1\uffff\1\uffff\1\154\3\uffff\3\145"+
        "\1\165\2\164\1\172\1\143\1\uffff\1\160\1\157\1\145\1\172\1\145\1"+
        "\141\1\163\1\145\1\143\1\164\2\uffff\2\172\1\163\1\164\1\172\1\141"+
        "\1\154\1\164\1\166\1\153\1\157\2\145\1\uffff\1\172\1\164\1\157\1"+
        "\uffff\2\172\1\154\1\172\1\111\1\105\1\117\1\101\1\105\1\uffff\1"+
        "\154\1\165\1\162\4\uffff\1\12\1\uffff\1\uffff\1\156\1\172\1\162"+
        "\1\154\1\143\1\151\1\165\1\uffff\1\162\1\141\1\167\1\157\1\uffff"+
        "\1\172\1\164\1\163\1\172\1\150\1\145\2\uffff\1\145\1\172\1\uffff"+
        "\1\154\1\151\1\145\2\141\3\162\1\uffff\1\141\1\162\1\145\2\uffff"+
        "\1\172\1\uffff\1\117\1\106\1\172\3\122\1\145\2\162\2\uffff\2\uffff"+
        "\3\uffff\1\uffff\1\163\1\uffff\1\172\1\144\1\150\1\143\1\154\1\151"+
        "\1\164\1\172\1\146\1\uffff\1\145\1\172\1\uffff\1\172\1\170\1\172"+
        "\1\uffff\1\154\2\143\1\164\1\147\1\145\1\172\1\164\1\156\1\164\1"+
        "\155\1\uffff\1\122\1\172\1\106\1\uffff\1\105\1\101\2\172\1\156\1"+
        "\151\4\uffff\1\163\1\151\1\uffff\3\172\1\164\1\142\1\143\1\172\1"+
        "\uffff\2\172\2\uffff\1\164\1\uffff\1\171\1\172\1\164\2\145\1\172"+
        "\1\uffff\1\172\1\143\1\172\1\145\1\172\1\uffff\2\172\1\124\2\uffff"+
        "\1\172\1\144\2\uffff\1\172\1\157\3\uffff\1\172\1\145\1\150\3\uffff"+
        "\2\172\1\uffff\1\145\2\172\2\uffff\1\145\1\uffff\1\156\3\uffff\1"+
        "\117\1\uffff\1\145\1\uffff\1\156\1\uffff\2\172\2\uffff\1\144\2\uffff"+
        "\1\157\1\164\1\122\2\172\2\uffff\1\172\1\146\1\163\1\172\3\uffff"+
        "\2\172\3\uffff";
    static final String DFA47_acceptS =
        "\21\uffff\1\30\3\uffff\1\41\1\42\1\43\1\44\1\45\6\uffff\1\61\1\63"+
        "\1\65\7\uffff\1\102\11\uffff\1\152\1\uffff\1\156\1\157\1\11\1\13"+
        "\1\1\1\2\1\23\1\3\1\53\1\4\1\124\2\uffff\1\152\16\uffff\1\14\1\31"+
        "\1\15\1\17\1\16\1\20\1\21\1\24\1\uffff\1\32\1\26\1\136\1\25\1\154"+
        "\1\155\1\27\1\30\7\uffff\1\41\1\42\1\43\1\44\1\45\1\46\1\62\1\135"+
        "\1\47\12\uffff\1\61\1\63\1\65\1\114\1\70\7\uffff\1\102\4\uffff\1"+
        "\153\2\uffff\1\143\1\144\1\uffff\1\147\1\uffff\1\150\1\151\1\156"+
        "\10\uffff\1\113\12\uffff\1\134\1\22\15\uffff\1\103\3\uffff\1\104"+
        "\11\uffff\1\76\11\uffff\1\145\7\uffff\1\7\4\uffff\1\121\6\uffff"+
        "\1\33\1\137\2\uffff\1\111\10\uffff\1\126\3\uffff\1\57\1\115\1\uffff"+
        "\1\71\13\uffff\1\141\1\142\3\uffff\1\146\1\uffff\1\105\11\uffff"+
        "\1\140\2\uffff\1\110\3\uffff\1\50\13\uffff\1\116\3\uffff\1\100\14"+
        "\uffff\1\6\7\uffff\1\55\2\uffff\1\66\1\123\1\uffff\1\34\6\uffff"+
        "\1\52\5\uffff\1\77\3\uffff\1\75\1\112\6\uffff\1\54\1\106\1\131\3"+
        "\uffff\1\10\1\117\1\12\2\uffff\1\35\3\uffff\1\51\1\60\1\uffff\1"+
        "\64\1\uffff\1\72\1\101\1\73\1\uffff\1\120\1\uffff\1\5\1\uffff\1"+
        "\107\2\uffff\1\127\1\122\1\uffff\1\37\1\40\5\uffff\1\125\1\133\4"+
        "\uffff\1\132\1\130\1\36\2\uffff\1\74\1\56\1\67";
    static final String DFA47_specialS =
        "\1\2\55\uffff\1\0\1\6\5\uffff\1\21\131\uffff\1\20\1\16\2\uffff\1"+
        "\14\71\uffff\1\23\1\1\1\15\1\3\1\uffff\1\12\62\uffff\1\24\1\26\2"+
        "\uffff\1\17\1\13\1\7\52\uffff\1\5\1\25\1\4\1\10\45\uffff\1\22\1"+
        "\11\71\uffff}>";
    static final String[] DFA47_transitionS = {
            "\11\67\2\66\2\67\1\66\22\67\1\66\1\12\1\65\1\40\1\64\1\21\1"+
            "\4\1\56\1\27\1\30\1\17\1\2\1\31\1\15\1\16\1\20\1\61\11\62\1"+
            "\43\1\42\1\14\1\1\1\13\1\33\1\52\1\50\1\46\2\64\1\45\1\44\2"+
            "\64\1\51\11\64\1\47\7\64\1\32\1\67\1\41\1\63\1\64\1\67\1\35"+
            "\1\34\1\11\1\7\1\5\1\23\2\64\1\36\4\64\1\37\1\55\1\24\1\64\1"+
            "\54\1\6\1\10\1\64\1\22\1\53\3\64\1\25\1\3\1\26\55\67\1\60\17"+
            "\67\1\57\uff44\67",
            "\1\71\1\70",
            "\1\73",
            "\1\75",
            "\1\77",
            "\1\102\13\uffff\1\101",
            "\1\105\13\uffff\1\107\1\104\1\uffff\1\106",
            "\1\110\3\uffff\1\112\5\uffff\1\111",
            "\1\113\11\uffff\1\115\6\uffff\1\114",
            "\1\120\12\uffff\1\117\2\uffff\1\121\2\uffff\1\116",
            "\1\122",
            "\1\124",
            "\1\126",
            "\1\130",
            "\1\132",
            "\1\134\3\uffff\1\135",
            "\1\137\4\uffff\1\140",
            "",
            "\1\143",
            "\1\144\7\uffff\1\146\5\uffff\1\145",
            "\1\151\20\uffff\1\150\2\uffff\1\147",
            "",
            "",
            "",
            "",
            "",
            "\1\157",
            "\1\161",
            "\1\163",
            "\1\164\5\uffff\1\166\6\uffff\1\165",
            "\1\171\6\uffff\1\170\1\167",
            "\1\173\11\uffff\1\172\5\uffff\1\174",
            "",
            "",
            "",
            "\1\u0080",
            "\1\u0082",
            "\1\u0084\1\uffff\1\u0083",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\47\u008e\1\u008d\uffd8\u008e",
            "\47\u0090\1\u008f\u0083\u0090\1\u0092\uff54\u0090",
            "\1\u0093",
            "\12\u0095\10\uffff\1\u0097\1\uffff\3\u0097\5\uffff\1\u0097"+
            "\13\uffff\1\u0094\6\uffff\1\u0095\2\uffff\1\u0097\1\uffff\3"+
            "\u0097\5\uffff\1\u0097\13\uffff\1\u0094",
            "\12\u0095\10\uffff\1\u0097\1\uffff\3\u0097\5\uffff\1\u0097"+
            "\22\uffff\1\u0095\2\uffff\1\u0097\1\uffff\3\u0097\5\uffff\1"+
            "\u0097",
            "\1\103\34\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\0\u008e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f\14\uffff\1\u00a0",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a6\3\uffff\1\u00a5",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9\1\u00aa",
            "\1\u00ab",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ac",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ae\5\uffff\1\u00af",
            "\1\u00b1\10\uffff\1\u00b0",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b6\5\uffff\1\u00b5",
            "\1\u00b7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\22\103\1\u00ba\7\103",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\47\u00cf\1\u00ce\u0083\u00cf\1\u0092\uff54\u00cf",
            "\47\u0090\1\u008f\u0083\u0090\1\u0092\uff54\u0090",
            "",
            "",
            "\12\u00d0\1\u00d2\2\u00d0\1\u00d1\ufff2\u00d0",
            "",
            "\12\u0095\10\uffff\1\u0097\1\uffff\3\u0097\5\uffff\1\u0097"+
            "\22\uffff\1\u0095\2\uffff\1\u0097\1\uffff\3\u0097\5\uffff\1"+
            "\u0097",
            "",
            "",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\1\u00da\31\103",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u00e9",
            "\1\u00ea",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u00f5",
            "\1\u00f7\2\uffff\1\u00f6",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u00fa",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u00fc\2\uffff\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\47\u0106\1\u0105\u0083\u0106\1\u0108\uff54\u0106",
            "\47\u0109\1\uffff\u0083\u0109\1\u0092\uff54\u0109",
            "\47\u0090\1\u008f\u0083\u0090\1\u0092\uff54\u0090",
            "\12\u00d0\1\u00d2\2\u00d0\1\u00d1\ufff2\u00d0",
            "\1\u00d2",
            "\47\u010b\1\u010a\u0083\u010b\1\u00d3\uff54\u010b",
            "",
            "\1\u010d",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0119",
            "\1\u011a",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u011c",
            "\1\u011d",
            "",
            "",
            "\1\u011e",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\u012c",
            "\1\u012d",
            "\1\103\13\uffff\12\103\7\uffff\10\103\1\u012e\21\103\4\uffff"+
            "\1\103\1\uffff\32\103",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\47\u0137\1\u0136\u0083\u0137\1\u0108\uff54\u0137",
            "\47\u0106\1\u0105\u0083\u0106\1\u0108\uff54\u0106",
            "",
            "",
            "\47\u0090\1\u008f\u0083\u0090\1\u0092\uff54\u0090",
            "\47\u0139\1\u0138\u0083\u0139\1\u00d3\uff54\u0139",
            "\47\u010b\1\u010a\u0083\u010b\1\u00d3\uff54\u010b",
            "",
            "\1\u013a\16\uffff\1\u013b",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\22\103\1\u0143\7\103",
            "\1\u0145",
            "",
            "\1\u0146",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0149",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "",
            "\1\u0156",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0158",
            "",
            "\1\u0159",
            "\1\u015a",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u015d",
            "\1\u015e",
            "\47\u015f\1\uffff\u0083\u015f\1\u0108\uff54\u015f",
            "\47\u0106\1\u0105\u0083\u0106\1\u0108\uff54\u0106",
            "\47\u0160\1\uffff\u0083\u0160\1\u00d3\uff54\u0160",
            "\47\u010b\1\u010a\u0083\u010b\1\u00d3\uff54\u010b",
            "\1\u0161",
            "\1\u0162",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "",
            "\1\u016c",
            "",
            "\1\u016d",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0174",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0176",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u017a",
            "",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u017c",
            "\47\u0106\1\u0105\u0083\u0106\1\u0108\uff54\u0106",
            "\47\u010b\1\u010a\u0083\u010b\1\u00d3\uff54\u010b",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u017e",
            "",
            "",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0180",
            "\1\u0181",
            "",
            "",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\u0184",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "",
            "\1\u0187",
            "",
            "\1\u0188",
            "",
            "",
            "",
            "\1\u0189",
            "",
            "\1\u018a",
            "",
            "\1\u018b",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "",
            "\1\u018e",
            "",
            "",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0195",
            "\1\u0196",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_46 = input.LA(1);

                        s = -1;
                        if ( (LA47_46=='\'') ) {s = 141;}

                        else if ( ((LA47_46>='\u0000' && LA47_46<='&')||(LA47_46>='(' && LA47_46<='\uFFFF')) ) {s = 142;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_206 = input.LA(1);

                        s = -1;
                        if ( ((LA47_206>='\u0000' && LA47_206<='&')||(LA47_206>='(' && LA47_206<='\u00AA')||(LA47_206>='\u00AC' && LA47_206<='\uFFFF')) ) {s = 265;}

                        else if ( (LA47_206=='\u00AB') ) {s = 146;}

                        else s = 145;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA47_0 = input.LA(1);

                        s = -1;
                        if ( (LA47_0=='=') ) {s = 1;}

                        else if ( (LA47_0=='+') ) {s = 2;}

                        else if ( (LA47_0=='|') ) {s = 3;}

                        else if ( (LA47_0=='&') ) {s = 4;}

                        else if ( (LA47_0=='e') ) {s = 5;}

                        else if ( (LA47_0=='s') ) {s = 6;}

                        else if ( (LA47_0=='d') ) {s = 7;}

                        else if ( (LA47_0=='t') ) {s = 8;}

                        else if ( (LA47_0=='c') ) {s = 9;}

                        else if ( (LA47_0=='!') ) {s = 10;}

                        else if ( (LA47_0=='>') ) {s = 11;}

                        else if ( (LA47_0=='<') ) {s = 12;}

                        else if ( (LA47_0=='-') ) {s = 13;}

                        else if ( (LA47_0=='.') ) {s = 14;}

                        else if ( (LA47_0=='*') ) {s = 15;}

                        else if ( (LA47_0=='/') ) {s = 16;}

                        else if ( (LA47_0=='%') ) {s = 17;}

                        else if ( (LA47_0=='v') ) {s = 18;}

                        else if ( (LA47_0=='f') ) {s = 19;}

                        else if ( (LA47_0=='p') ) {s = 20;}

                        else if ( (LA47_0=='{') ) {s = 21;}

                        else if ( (LA47_0=='}') ) {s = 22;}

                        else if ( (LA47_0=='(') ) {s = 23;}

                        else if ( (LA47_0==')') ) {s = 24;}

                        else if ( (LA47_0==',') ) {s = 25;}

                        else if ( (LA47_0=='[') ) {s = 26;}

                        else if ( (LA47_0=='?') ) {s = 27;}

                        else if ( (LA47_0=='b') ) {s = 28;}

                        else if ( (LA47_0=='a') ) {s = 29;}

                        else if ( (LA47_0=='i') ) {s = 30;}

                        else if ( (LA47_0=='n') ) {s = 31;}

                        else if ( (LA47_0=='#') ) {s = 32;}

                        else if ( (LA47_0==']') ) {s = 33;}

                        else if ( (LA47_0==';') ) {s = 34;}

                        else if ( (LA47_0==':') ) {s = 35;}

                        else if ( (LA47_0=='F') ) {s = 36;}

                        else if ( (LA47_0=='E') ) {s = 37;}

                        else if ( (LA47_0=='B') ) {s = 38;}

                        else if ( (LA47_0=='S') ) {s = 39;}

                        else if ( (LA47_0=='A') ) {s = 40;}

                        else if ( (LA47_0=='I') ) {s = 41;}

                        else if ( (LA47_0=='@') ) {s = 42;}

                        else if ( (LA47_0=='w') ) {s = 43;}

                        else if ( (LA47_0=='r') ) {s = 44;}

                        else if ( (LA47_0=='o') ) {s = 45;}

                        else if ( (LA47_0=='\'') ) {s = 46;}

                        else if ( (LA47_0=='\u00BB') ) {s = 47;}

                        else if ( (LA47_0=='\u00AB') ) {s = 48;}

                        else if ( (LA47_0=='0') ) {s = 49;}

                        else if ( ((LA47_0>='1' && LA47_0<='9')) ) {s = 50;}

                        else if ( (LA47_0=='^') ) {s = 51;}

                        else if ( (LA47_0=='$'||(LA47_0>='C' && LA47_0<='D')||(LA47_0>='G' && LA47_0<='H')||(LA47_0>='J' && LA47_0<='R')||(LA47_0>='T' && LA47_0<='Z')||LA47_0=='_'||(LA47_0>='g' && LA47_0<='h')||(LA47_0>='j' && LA47_0<='m')||LA47_0=='q'||LA47_0=='u'||(LA47_0>='x' && LA47_0<='z')) ) {s = 52;}

                        else if ( (LA47_0=='\"') ) {s = 53;}

                        else if ( ((LA47_0>='\t' && LA47_0<='\n')||LA47_0=='\r'||LA47_0==' ') ) {s = 54;}

                        else if ( ((LA47_0>='\u0000' && LA47_0<='\b')||(LA47_0>='\u000B' && LA47_0<='\f')||(LA47_0>='\u000E' && LA47_0<='\u001F')||LA47_0=='\\'||LA47_0=='`'||(LA47_0>='~' && LA47_0<='\u00AA')||(LA47_0>='\u00AC' && LA47_0<='\u00BA')||(LA47_0>='\u00BC' && LA47_0<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA47_208 = input.LA(1);

                        s = -1;
                        if ( (LA47_208=='\r') ) {s = 209;}

                        else if ( (LA47_208=='\n') ) {s = 210;}

                        else if ( ((LA47_208>='\u0000' && LA47_208<='\t')||(LA47_208>='\u000B' && LA47_208<='\f')||(LA47_208>='\u000E' && LA47_208<='\uFFFF')) ) {s = 208;}

                        else s = 211;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA47_312 = input.LA(1);

                        s = -1;
                        if ( ((LA47_312>='\u0000' && LA47_312<='&')||(LA47_312>='(' && LA47_312<='\u00AA')||(LA47_312>='\u00AC' && LA47_312<='\uFFFF')) ) {s = 352;}

                        else if ( (LA47_312=='\u00AB') ) {s = 211;}

                        else s = 268;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA47_310 = input.LA(1);

                        s = -1;
                        if ( ((LA47_310>='\u0000' && LA47_310<='&')||(LA47_310>='(' && LA47_310<='\u00AA')||(LA47_310>='\u00AC' && LA47_310<='\uFFFF')) ) {s = 351;}

                        else if ( (LA47_310=='\u00AB') ) {s = 264;}

                        else s = 263;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA47_47 = input.LA(1);

                        s = -1;
                        if ( (LA47_47=='\'') ) {s = 143;}

                        else if ( ((LA47_47>='\u0000' && LA47_47<='&')||(LA47_47>='(' && LA47_47<='\u00AA')||(LA47_47>='\u00AC' && LA47_47<='\uFFFF')) ) {s = 144;}

                        else if ( (LA47_47=='\u00AB') ) {s = 146;}

                        else s = 145;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA47_267 = input.LA(1);

                        s = -1;
                        if ( (LA47_267=='\'') ) {s = 266;}

                        else if ( ((LA47_267>='\u0000' && LA47_267<='&')||(LA47_267>='(' && LA47_267<='\u00AA')||(LA47_267>='\u00AC' && LA47_267<='\uFFFF')) ) {s = 267;}

                        else if ( (LA47_267=='\u00AB') ) {s = 211;}

                        else s = 268;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA47_313 = input.LA(1);

                        s = -1;
                        if ( (LA47_313=='\'') ) {s = 266;}

                        else if ( (LA47_313=='\u00AB') ) {s = 211;}

                        else if ( ((LA47_313>='\u0000' && LA47_313<='&')||(LA47_313>='(' && LA47_313<='\u00AA')||(LA47_313>='\u00AC' && LA47_313<='\uFFFF')) ) {s = 267;}

                        else s = 268;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA47_352 = input.LA(1);

                        s = -1;
                        if ( (LA47_352=='\'') ) {s = 266;}

                        else if ( ((LA47_352>='\u0000' && LA47_352<='&')||(LA47_352>='(' && LA47_352<='\u00AA')||(LA47_352>='\u00AC' && LA47_352<='\uFFFF')) ) {s = 267;}

                        else if ( (LA47_352=='\u00AB') ) {s = 211;}

                        else s = 268;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA47_210 = input.LA(1);

                        s = -1;
                        if ( (LA47_210=='\'') ) {s = 266;}

                        else if ( ((LA47_210>='\u0000' && LA47_210<='&')||(LA47_210>='(' && LA47_210<='\u00AA')||(LA47_210>='\u00AC' && LA47_210<='\uFFFF')) ) {s = 267;}

                        else if ( (LA47_210=='\u00AB') ) {s = 211;}

                        else s = 268;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA47_266 = input.LA(1);

                        s = -1;
                        if ( (LA47_266=='\'') ) {s = 312;}

                        else if ( ((LA47_266>='\u0000' && LA47_266<='&')||(LA47_266>='(' && LA47_266<='\u00AA')||(LA47_266>='\u00AC' && LA47_266<='\uFFFF')) ) {s = 313;}

                        else if ( (LA47_266=='\u00AB') ) {s = 211;}

                        else s = 268;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA47_147 = input.LA(1);

                        s = -1;
                        if ( ((LA47_147>='\u0000' && LA47_147<='\t')||(LA47_147>='\u000B' && LA47_147<='\f')||(LA47_147>='\u000E' && LA47_147<='\uFFFF')) ) {s = 208;}

                        else if ( (LA47_147=='\r') ) {s = 209;}

                        else if ( (LA47_147=='\n') ) {s = 210;}

                        else s = 211;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA47_207 = input.LA(1);

                        s = -1;
                        if ( (LA47_207=='\'') ) {s = 143;}

                        else if ( ((LA47_207>='\u0000' && LA47_207<='&')||(LA47_207>='(' && LA47_207<='\u00AA')||(LA47_207>='\u00AC' && LA47_207<='\uFFFF')) ) {s = 144;}

                        else if ( (LA47_207=='\u00AB') ) {s = 146;}

                        else s = 145;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA47_144 = input.LA(1);

                        s = -1;
                        if ( (LA47_144=='\'') ) {s = 143;}

                        else if ( ((LA47_144>='\u0000' && LA47_144<='&')||(LA47_144>='(' && LA47_144<='\u00AA')||(LA47_144>='\u00AC' && LA47_144<='\uFFFF')) ) {s = 144;}

                        else if ( (LA47_144=='\u00AB') ) {s = 146;}

                        else s = 145;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA47_265 = input.LA(1);

                        s = -1;
                        if ( (LA47_265=='\'') ) {s = 143;}

                        else if ( (LA47_265=='\u00AB') ) {s = 146;}

                        else if ( ((LA47_265>='\u0000' && LA47_265<='&')||(LA47_265>='(' && LA47_265<='\u00AA')||(LA47_265>='\u00AC' && LA47_265<='\uFFFF')) ) {s = 144;}

                        else s = 145;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA47_143 = input.LA(1);

                        s = -1;
                        if ( (LA47_143=='\'') ) {s = 206;}

                        else if ( ((LA47_143>='\u0000' && LA47_143<='&')||(LA47_143>='(' && LA47_143<='\u00AA')||(LA47_143>='\u00AC' && LA47_143<='\uFFFF')) ) {s = 207;}

                        else if ( (LA47_143=='\u00AB') ) {s = 146;}

                        else s = 145;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA47_53 = input.LA(1);

                        s = -1;
                        if ( ((LA47_53>='\u0000' && LA47_53<='\uFFFF')) ) {s = 142;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA47_351 = input.LA(1);

                        s = -1;
                        if ( (LA47_351=='\'') ) {s = 261;}

                        else if ( (LA47_351=='\u00AB') ) {s = 264;}

                        else if ( ((LA47_351>='\u0000' && LA47_351<='&')||(LA47_351>='(' && LA47_351<='\u00AA')||(LA47_351>='\u00AC' && LA47_351<='\uFFFF')) ) {s = 262;}

                        else s = 263;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA47_205 = input.LA(1);

                        s = -1;
                        if ( (LA47_205=='\'') ) {s = 261;}

                        else if ( ((LA47_205>='\u0000' && LA47_205<='&')||(LA47_205>='(' && LA47_205<='\u00AA')||(LA47_205>='\u00AC' && LA47_205<='\uFFFF')) ) {s = 262;}

                        else if ( (LA47_205=='\u00AB') ) {s = 264;}

                        else s = 263;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA47_261 = input.LA(1);

                        s = -1;
                        if ( (LA47_261=='\'') ) {s = 310;}

                        else if ( ((LA47_261>='\u0000' && LA47_261<='&')||(LA47_261>='(' && LA47_261<='\u00AA')||(LA47_261>='\u00AC' && LA47_261<='\uFFFF')) ) {s = 311;}

                        else if ( (LA47_261=='\u00AB') ) {s = 264;}

                        else s = 263;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA47_311 = input.LA(1);

                        s = -1;
                        if ( (LA47_311=='\'') ) {s = 261;}

                        else if ( (LA47_311=='\u00AB') ) {s = 264;}

                        else if ( ((LA47_311>='\u0000' && LA47_311<='&')||(LA47_311>='(' && LA47_311<='\u00AA')||(LA47_311>='\u00AC' && LA47_311<='\uFFFF')) ) {s = 262;}

                        else s = 263;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA47_262 = input.LA(1);

                        s = -1;
                        if ( (LA47_262=='\'') ) {s = 261;}

                        else if ( ((LA47_262>='\u0000' && LA47_262<='&')||(LA47_262>='(' && LA47_262<='\u00AA')||(LA47_262>='\u00AC' && LA47_262<='\uFFFF')) ) {s = 262;}

                        else if ( (LA47_262=='\u00AB') ) {s = 264;}

                        else s = 263;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}