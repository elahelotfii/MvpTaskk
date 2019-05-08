package ir.client.mvptaskk.mvp.features.testmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import ir.client.mvptaskk.R
import kotlinx.android.synthetic.main.activity_test_mvp.*

class TestMvpActivity(override val recycler: Any) : AppCompatActivity() , Contract.View {

    private val presenter = TestPresenter(this)


    List<String> names = new ArrayList<>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvp)

       val adapter = TestAdapter()
        recycler.setAdapter(adapter)
        recycler.setLayoutManager(new LinearLayoutManager(TestMvpActivity.this,RecyclerView.VERTICAL,false))



    }


    override fun getNote1(){
        val Note1 = edtNote1.text.toString()
        presenter.onNote1Received(Note1)
    }

    override fun getNote2(){
        val Note2 = edtNote2.text.toString()
        presenter.onNote2Received(Note2)
    }

    override fun getNote3(){
        val Note3 = edtNote3.text.toString()
        presenter.onNote3Received(Note3)
    }

    override fun getNote4(){
        val Note4 = edtNote4.text.toString()
        presenter.onNote4Received(Note4)
    }

    override fun getNote5(){
        val Note5 = edtNote5.text.toString()
        presenter.onNote5Received(Note5)
    }

    override fun getNote6(){
        val Note6 = edtNote6.text.toString()
        presenter.onNote6Received(Note6)
    }

    override fun getNote7(){
        val Note7 = edtNote7.text.toString()
        presenter.onNote7Received(Note7)
    }

    override fun showFailureToast1() {
        Toast.makeText(this,"Unknown Note", Toast.LENGTH_LONG).show()
    }

    override fun showFailureToast2() {
        Toast.makeText(this,"Jome Tatile", Toast.LENGTH_LONG).show()
    }
}

private infix fun Any.LinearLayoutManager(any: Any): Any {

}

private fun Any.setLayoutManager(newLinearLayoutManager: Any, vertical: Int, b: Boolean) {

}

private fun Any.setAdapter(adapter: TestAdapter) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
