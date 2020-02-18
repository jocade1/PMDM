package com.example.proyecto.Fragmentos;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.proyecto.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentoCantante.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentoCantante#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentoCantante extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
    private static final String ARG_PARAM4 = "param4";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private int mParam2;
    private String mParam3;
    private String mParam4;

    private OnFragmentInteractionListener mListener;

    public FragmentoCantante() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Titulo Cancion.
     * @param param2 Foto Cancion.
     * @param param3 Autor Cancion.
     * @param param4 Genero Cancion.
     * @return A new instance of fragment FragmentoCantante.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentoCantante newInstance(String param1, int param2,String param3,String param4) {
        FragmentoCantante fragment = new FragmentoCantante();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putInt(ARG_PARAM2, param2);
        args.putString(ARG_PARAM3, param3);
        args.putString(ARG_PARAM4, param4);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getInt(ARG_PARAM2);
            mParam3 = getArguments().getString(ARG_PARAM3);
            mParam4 = getArguments().getString(ARG_PARAM4);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View F = inflater.inflate(R.layout.fragment_fragmento_cantante, container, false);

        TextView titulo =(TextView) F.findViewById(R.id.TextView_titulo);
        titulo.setText("Titulo: "+String.valueOf(mParam1));

        ImageView imageView =(ImageView) F.findViewById(R.id.ImagenView_foto);
        imageView.setImageResource(mParam2);

        TextView autor = F.findViewById(R.id.TextView_autor);
        autor.setText("Autor:" +String.valueOf(mParam3));

        TextView genero = F.findViewById(R.id.TextView_genero);
        genero.setText("Genero:" +String.valueOf(mParam4));

        return F;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }
/*
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    *//**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
