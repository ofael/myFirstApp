package app.ma.ghe.imc.imc_app.helpers

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.P)
class HelperDB(
    context: Context?
) : SQLiteOpenHelper(context, NOME_BANCO,null,VERSAO_ATUAL ) {

    companion object{
        private val NOME_BANCO = "usuario.db"
        private val VERSAO_ATUAL = 1
    }

    val TABLE_NAME = "logins"
    val COLUMNS_LOGIN = "username"
    val COLUMNS_SENHA = "password"
    val DROP_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"
    val CREAT_TABLE = "CREATE TABLE $TABLE_NAME(" + "$COLUMNS_LOGIN TEXT NOT NULL," +
                                                    "$COLUMNS_SENHA TEXT NOT NULL," +
                                                    "" +
                                                    "PRIMARY KEY($COLUMNS_LOGIN AUTOINCREMENT)"+")"
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(CREAT_TABLE)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        if(oldVersion != newVersion){
            db?.execSQL(DROP_TABLE)
        }
        onCreate(db)
    }

    private fun adicionarConta(){

        val db = writableDatabase ?: return
        var content = ContentValues()
        db.close()
    }

}