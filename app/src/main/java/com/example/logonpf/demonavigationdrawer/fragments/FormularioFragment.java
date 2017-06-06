package com.example.logonpf.demonavigationdrawer.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.logonpf.demonavigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FormularioFragment extends Fragment implements View.OnClickListener{


    private EditText etValor1, etValor2;
    private Button btSomar, btSubtrair, btDividir, btMultiplicar;
    private TextView tvResultado;

    public FormularioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View itemView = inflater.inflate(R.layout.fragment_formulario, container, false);

        etValor1 = (EditText) itemView.findViewById(R.id.etValor1);
        etValor2 = (EditText) itemView.findViewById(R.id.etValor2);
        btSomar = (Button) itemView.findViewById(R.id.btSomar);
        btSubtrair= (Button) itemView.findViewById(R.id.btSubtrair);
        btDividir= (Button) itemView.findViewById(R.id.btDividir);
        btMultiplicar = (Button) itemView.findViewById(R.id.btMultiplicar);
        tvResultado = (TextView) itemView.findViewById(R.id.tvResultado);


        btSomar.setOnClickListener(this);
        btSubtrair.setOnClickListener(this);
        btMultiplicar.setOnClickListener(this);
        btDividir.setOnClickListener(this);
        return itemView;
    }

    @Override
    public void onClick(View v) {
        int resultado = 0;
        if(etValor1.getText().toString().trim().equals("")) {
            Toast.makeText(getContext(), "Informe o valor 1",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        if(etValor2.getText().toString().trim().equals("")) {
            Toast.makeText(getContext(), "Informe o valor 2",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        int v1 = Integer.parseInt(etValor1.getText().toString());
        int v2 = Integer.parseInt(etValor2.getText().toString());
        switch (v.getId()) {
            case R.id.btSomar:
                resultado = v1 + v2;
                break;
            case R.id.btSubtrair:
                resultado = v1 - v2;
                break;
            case R.id.btMultiplicar:
                resultado = v1 * v2;
                break;
            case R.id.btDividir:
                resultado = v1 / v2;
                break;
        }
        tvResultado.setText(String.valueOf(resultado));
    }
}
