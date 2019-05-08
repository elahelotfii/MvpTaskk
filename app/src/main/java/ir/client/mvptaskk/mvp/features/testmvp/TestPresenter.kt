package ir.client.mvptaskk.mvp.features.testmvp

import ir.client.mvptaskk.mvp.features.testmvp.TestModel
import ir.client.mvptaskk.mvp.features.testmvp.TestMvpActivity

class TestPresenter(private val  view : Contract.View) : Contract.Presenter {

    val model = TestModel(this)

    override fun onNote1Received(Note1: String) {
        if(Note1 == "shanbe")
            view.getNote1()
        else
            view.showFailureToast1()

    }
    override fun onNote2Received(Note2: String) {
        if(Note2 == "yekshanbe")
            view.getNote2()
        else
            view.showFailureToast1()

    }

    override fun onNote3Received(Note3: String) {
        if(Note3 == "doshanbe")
            view.getNote3()
        else
            view.showFailureToast1()

    }

    override fun onNote4Received(Note4: String) {
        if(Note4 == "seshanbe")
            view.getNote4()
        else
            view.showFailureToast1()

    }

    override fun onNote5Received(Note5: String) {
        if(Note5 == "chaharshanbe")
            view.getNote5()
        else
            view.showFailureToast1()

    }

    override fun onNote6Received(Note6: String) {
        if(Note6 == "panjshanbe")
            view.getNote6()
        else
            view.showFailureToast1()

    }

    override fun onNote7Received(Note7: String) {
        if(Note7 == "jome")
            view.getNote7()
        else
            view.showFailureToast2()

    }

}
