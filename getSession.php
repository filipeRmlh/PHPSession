<?php
    function getSessData($PHPSESSID){
        $sessPath=session_save_path();
        $barr = (strtoupper(substr(PHP_OS, 0, 3)) === 'WIN')?"\\":"/";
        
        try{
            $filePath = $sessPath.$barr.'sess_'.$PHPSESSID;
            $contents = file_get_contents($filePath);
            session_start();
            session_decode($contents);
            $sess = $_SESSION;
            session_write_close();
            return $sess;
        }catch(Exception $e){
            return "erro ao tentar acessar sessão, ela existe mesmo?";
        }
        
    }
    //t76oeidsjndjuhak6ggc3cm8um
    echo json_encode(getSessData($argv[1]));
   
    