import com.github.ajalt.clikt.core.subcommands
import uk.ac.le.ember.labpipe.server.cmdline.*


fun main(args: Array<String>) {
    var argArray = args
    if (argArray.isEmpty()) {
        argArray = arrayOf("--help")
    }
    LPServerCmdLine().subcommands(
        Config().subcommands(Server(), Database(), Email()),
        Check(), Run(), Init(),
        Add().subcommands(
            AddOperator(),
            AddAccessToken(),
            AddRole(),
            AddEmailGroup(),
            AddInstrument(),
            AddLocation(),
            AddStudy()
        )
    ).main(argArray)
}