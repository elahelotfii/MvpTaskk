package ir.client.mvptaskk.mvp.features.testmvp

interface Contract {


    interface View{
        abstract val new: Any
        abstract val recycler: Any

        fun getNote1()
        fun getNote2()
        fun getNote3()
        fun getNote4()
        fun getNote5()
        fun getNote6()
        fun getNote7()
        fun showFailureToast1()
        fun showFailureToast2()
         infix fun Any.LinearLayoutManager(any: Any): Any
         fun Any.setLayoutManager(newLinearLayoutManager: Any, vertical: Int, b: Boolean)
         fun Any.setAdapter(adapter: TestAdapter)

    }

    interface Presenter{
        fun onNote1Received(Note1: String)
        fun onNote2Received(Note2: String)
        fun onNote3Received(Note3: String)
        fun onNote4Received(Note4: String)
        fun onNote5Received(Note5: String)
        fun onNote6Received(Note6: String)
        fun onNote7Received(Note7: String)

    }

}