package ir.client.mvptaskk.mvp.features.testmvp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import ir.client.mvptaskk.R

class TestAdapter : RecyclerView.Adapter<TestAdapter.TestViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
       View() v = LayoutInflater.from(parent.getcontext()).inflate(R.layout.activity_test_mvp,parent,false)
        val holder = TestViewHolder(v)
        return holder
    }

    override fun getItemCount(): Int {
        return 8
    }

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        val myList
        val names = myList
        names.add("shanbe")
        names.add("yekshanbe")
        holder.names.settext()
    }

    class TestViewHolder : RecyclerView.ViewHolder() {

    }
}

private fun Context?.inflate(activity_test_mvp: Int, parent: ViewGroup, b: Boolean): Any {

}

private fun ViewGroup.getcontext(): Context? {

}
