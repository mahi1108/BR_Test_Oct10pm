package cubex.mahesh.br_test_oct10pm

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView

class MyReceiver(var tview:TextView) : BroadcastReceiver( )
{
    override fun onReceive(p0: Context?, p1: Intent?) {
                tview.text = p1!!.action
    }
}
