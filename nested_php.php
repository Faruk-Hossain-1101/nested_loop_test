<?php
ini_set('max_execution_time', 300);
$value = 1000;

$start_time = microtime(true);
$difference = 0;

function nested_loops_count($value) {
    global $difference;
    global $start_time;
    if ($value >= 1) {
        $value -= 1;
        nested_loops_count($value);
    } else {
        $end_time = microtime(true);
        $difference = $end_time - $start_time;
    }

    return $difference;
}

function calculate_avg_difference($n){
    $total_time = 0;
    global $value;
    for ($i=0;$i<$n; $i++){
        $diff = nested_loops_count($value);
        $total_time += $diff;
    }
    return ($total_time/$n);
}

echo calculate_avg_difference(1000);
echo "\n";
?>
