package spark.layoutchange

import android.animation.LayoutTransition
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.navigation.fragment.findNavController
import spark.layoutchange.databinding.FragmentFirstLayoutchangeBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstLayoutchangeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstLayoutchangeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.layoutAddDelHo.setOnClickListener {
            //添加view
            Worker.addView(it as ViewGroup)
        }
        binding.layoutAddDelHo2.layoutTransition = LayoutTransition()
        binding.layoutAddDelHo2.setOnClickListener {
            //添加view
            Worker.addView(it as ViewGroup)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}