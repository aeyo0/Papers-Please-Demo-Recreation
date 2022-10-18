public class ImagePerson
{
   private Immigrant i;
   // private String face;
   
   public ImagePerson(Immigrant i)
   {
      this.i = i;
   }
   
   public String getFace()
   {
      if(i.getGender().equalsIgnoreCase("f"))
      {
         return 
                  "------------------------------------------------------------------" + "\n" +   
                  "                   IMMIGRATION BOOTH WINDOW                       " + "\n" +   
                  "                                                                  " + "\n" +   
                  "------------------------------------------------------------------" + "\n" +   
                  " 		           ,     ,  ._  ,                                    " + "\n" +       
                  "                _.MMmm.mMm_Mm.MMm_:mMMmmm.._  .                   " + "\n" +     
                  "           _ .-mmMMMMMMMMMMMMm:MMm:MMMMMMMMMm._                   " + "\n" +
                  "            `-.mm.MMMMMMM:MMMMMMMmmMMMMMMMMMmm._                  " + "\n" +
                  "         _.mMMMMMmMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                 " + "\n" +
                  "          .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm._              " + "\n" +
                  "         _.MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm._           " + "\n" +
                  "      ..mMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMmmm.           " + "\n" +
                  "     _.mmMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm.            " + "\n" +
                  "      _.MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm_           " + "\n" +
                  "  .mmMMMMMMMMMMMMMMMMMMMMMMMM' `MMMMMMMMMMMMMMMMMMMMMMm,          " + "\n" +
                  " _.-' _.mMMMMMMMMMMMMMMMMMMM'      `MMMMMMMMMMMMMMMM`             " + "\n" +
                  "  _,MMMmMMMMMMMMMMMMMMMM'            `MMMMMMMMMMMMMMmm.           " + "\n" +
                  "    _.-'MMMMMMMMMMMMMMM.'```.    ,'```.MMMMMMMMMMMMMMMM.          " + "\n" +
                  "   .mmMMMMMMMMMMMMMMMM' <(o)>`  '<(o)>` MMMMMMMMMMMMMMMm.         " + "\n" +
                  "      .MMMMMMMMMMMMMMM                 'MMMMMMMMMMMMMMM:          " + "\n" +
                  "   ,MMMmMMMMMMMMMMMMM'                 `MMMMMMMMMMMMmm.           " + "\n" +
                  "  ,ME:MMMMMMMMMMMMMM_6       -  -       7_MMMMMMMMM:Mm_           " + "\n" +
                  "  !M:MmmMMMMMMMMMMMMML_                _JMMMMMMMMMm:MMm.          " + "\n" +
                  "  '':mMMMMMMMMMMMMMMMM      ______      dMMMMMMMMMMM:'Mm.         " + "\n" +
                  "   ':MMM:MMMMMMMMMMMMMM     `.__.'     MMMMMM:MMMMMMm: `          " + "\n" +
                  "  .M:MMM:MMMMMMMMMMMMMMM`.          ,'MMMMMMM:MMMMMMMm            " + "\n" +
                  "    .Mm:mMMMMMMMMMMMMMMM| `.      .' |MMMMMMm:.MMMMM.             " + "\n" +
                  "   .Mm:mMMMMMMMMMMMMMMMM|   `----':: |MMMMMMMmm`MMMMMm.           " + "\n" +
                  "     !:mMMMMMMMMMMMMMMMM|      ::::. |MMMMMMMMMMM``mMm.           " + "\n" +
                  "       !MMMMMMMMM'MMMMMM|      .:::. |MMMMMMMMMMMMM.._            " + "\n" +
                  "       MMMMMMMMM'MMMM'M        ::::'   MMMMMMMMMMMMMMm,           " + "\n" +
                  "      .mMMMMMMM'MMMM'MMm.       '     .`.MMMMMMMMMMMMm.           " + "\n" +
                  "       !!JmMMM'MMM' `M:.      ,  ,     .. M..MMMMMMMMm.           " + "\n" +
                  "        FMMMMMm.`M   M..              .. `Mm   ```.MMMmm.         " + "\n" +
                  "        MMMM'    M      ..           ..    `M      MM`.M!         " + "\n" +
                  "        Mm'               ..        ..      M      M'             " + "\n" +
                  "                                                                  " + "\n" +
                  "------------------------------------------------------------------" + "\n";
       }
       else
       {
         return  
                  "--------------------------------------------------" + "\n" +   
                  "             IMMIGRATION BOOTH WINDOW             " + "\n" +   
                  "                                                  " + "\n" +   
                  "--------------------------------------------------" + "\n" + 
                  "        		    _____    ____                   " + "\n" +
                  "              .#########.#######..                " + "\n" +
                  "            .#######################.             " + "\n" +
                  "          .############################.          " + "\n" +
                  "         .################################.       " + "\n" +
                  "        .#########,##,#####################.      " + "\n" +
                  "       .#########-#,'########## ############.     " + "\n" +
                  "      .######'#-##' # ##'### #. `####:#######.    " + "\n" +
                  "      #####:'# #'###,##' # # +#. `###:':######    " + "\n" +
                  "     .####,'###,##  ###  # # #`#. -####`######.   " + "\n" +
                  "    .####+.' ,'#  ##' #   # # #`#`.`#####::####'  " + "\n" +
                  "    ####'    #  '##'  #   #_'# #.## `#######;##   " + "\n" +
                  "    #:##'      '       #   # ``..__# `#######:#   " + "\n" +
                  "    #:##'  .#######s.   #.  .s######.``#####:##   " + "\n" +
                  "    #:##   .`______``'    '``_____``. `.#####:#   " + "\n" +
                  "   .#:##   ><'(##)'> )    ( <'(##)`><   `####;#   " + "\n" +
                  "   ##:##  , , -==-' '.    .` `-==- . |  ######'   " + "\n" +
                  "   #|-'| | |      ,  :    : ,       | ` :####:'   " + "\n" +
                  "   :#  |: '  '   |  .     .  .  `    `  |`####    " + "\n" +
                  "   #|  :|   |   '  '       `  |   . ,   :  #:#    " + "\n" +
                  "   #L. | | ,  |   `.-._ _.-.'   .  | |  : ) J##   " + "\n" +
                  "  ###| `  |  '                   |  : : |  |##    " + "\n" +
                  "   ## #|.:: '       _    _        ` | | |'####    " + "\n" +
                  "   #####||  |  (.-'.__`-'__.`-.)   :| ' ######    " + "\n" +
                  "   ######|:      `-...___..-' '     :: |######    " + "\n" +
                  "   #######|``.                   ,'|  |#######    " + "\n" +
                  "  .# ######|  |       ___       | |' |#######     " + "\n" +
                  "  # #'#####||  |    -     -    |  ,'|### #. #.    " + "\n" +
                  "  `#  #####| '-.`             ' ,-'  |### #  #    " + "\n" +
                  "      #' `#|    '._         ,.-'     #`#`#.       " + "\n" +
                  "           |       .'------' :       |#   #       " + "\n" +
                  "           |       :         :       |            " + "\n" +
                  "           |       :         :       |            " + "\n" +
                  "                   :         :                    " + "\n" +
                  "--------------------------------------------------" + "\n";
       }
    }
    
    /*
    public String getFace()
    {
      return face;
    }   
    */         
}